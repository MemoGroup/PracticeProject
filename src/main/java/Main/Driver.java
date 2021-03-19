package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	static WebDriver wd=null;
	
	private Driver()
	{
		 System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
		 wd=new ChromeDriver();
		 wd.manage().window().maximize();
	}
	
	public static WebDriver getDriver()
	{
		if(wd==null)
		{
			new Driver();
		}
		return wd;
	}
	
	public static void close()
	{
		wd.close();
	}
}
