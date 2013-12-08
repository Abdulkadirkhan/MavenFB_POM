package Pages;

import org.openqa.selenium.By;

import Core.Page;

public class FriendsPage extends Page {

	public boolean searchfriend(String FriendName)
	{
		driver.findElement(By.xpath("//input[@value='Search Your Friends']")).click();
		driver.findElement(By.xpath("//input[@value='Search Your Friends']")).sendKeys(FriendName);
		
		if (isLinkPresent(FriendName))
		{
			return true;
		}else
		{
			return false;
		}
	}
}
