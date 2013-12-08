package Pages;

import org.openqa.selenium.By;

import Core.Page;

public class LandingPage extends Page {
	
	public MyProfilePage gotoprofile()
	{
		driver.findElement(By.xpath("//*[@id='pagelet_welcome_box']/div/div/div/div[2]/a[1]")).click();
		
		return new MyProfilePage();
	}

}
