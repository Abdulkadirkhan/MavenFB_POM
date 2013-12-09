package Core;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Util.Xls_Reader;


public class Page {
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties object = new Properties();
	public static FileInputStream fis;
	public static Xls_Reader excel = new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\resources\\testdata.xlsx");
	
	public Page()
	{
	if (driver == null)
	{
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\object.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			object.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (config.getProperty("Browser").equals("Firefox"))
		{
			driver = new FirefoxDriver(); 
		}
		
		else if (config.getProperty("Browser").equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
	else if (config.getProperty("Browser").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
				
		driver.navigate().to(config.getProperty("Testsite"));
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	
//		driver = new FirefoxDriver();
//		driver.navigate().to("http://facebook.com");
//		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
	}
	}

	public boolean isLinkPresent(String linktext)
	{
		try
		{
			driver.findElement(By.linkText(linktext));
			return true;
		}catch(Throwable t)
		{
			return false;
		}
	}
}
