package Test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Core.Page;
import Pages.FriendsPage;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.MyProfilePage;
import Util.TestUtil;

public class Testcases {

	
	@BeforeTest
	public void isSkip()
	{
		if(!TestUtil.isExecutable("Testcases", Page.excel))
		{
			throw new SkipException("Skipping");
		}
	}
	
	@Test
	public void dologin() {
		
      LoginPage loginpage = new LoginPage();
      LandingPage landpage = loginpage.dologin("abdulkadir786@gmail.com", "victory4fame123");
      MyProfilePage profilepage = landpage.gotoprofile();
      FriendsPage friendpage = profilepage.gotofriends();
      Assert.assertTrue(friendpage.searchfriend("Vinay Kumar"), "Friend not found");
      System.out.println("Friend found");
	}

}
