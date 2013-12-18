package Test;

import org.testng.Assert;

import Pages.FriendsPage;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.MyProfilePage;

public class Testcases {

	public static void main(String[] args) {
		
      LoginPage loginpage = new LoginPage();
      LandingPage landpage = loginpage.dologin("abdulkadir786@gmail.com", "");
      MyProfilePage profilepage = landpage.gotoprofile();
      FriendsPage friendpage = profilepage.gotofriends();
      Assert.assertTrue(friendpage.searchfriend("Vinay Kumar"), "Friend not found");
      System.out.println("Friend found");
	}

}
