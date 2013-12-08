package Pages;

import org.openqa.selenium.By;

import Core.Page;

public class LoginPage extends Page {
	
	public LandingPage dologin(String Username, String Password)
	{

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(Username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		
		return new LandingPage();
		
	}

}
