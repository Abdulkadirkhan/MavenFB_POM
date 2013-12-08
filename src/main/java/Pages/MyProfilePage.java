package Pages;

import org.openqa.selenium.By;

import Core.Page;

public class MyProfilePage extends Page{
	
	public FriendsPage gotofriends()
	{
	  driver.findElement(By.linkText("Friends")).click();	
	  
	  return new FriendsPage();
	  
	}

}
