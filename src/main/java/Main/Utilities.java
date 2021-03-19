package Main;

import java.io.FileReader;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities 
{
	public static WebDriver wd;
	static WebElement element;
	static Properties p;
	public static void init()
	{
		wd=Driver.getDriver();
		element=null;
		p=loadProperties();
	}
	
	public static void goToPage(String url)
	{
		wd.get(url);
	}
	
	public static WebElement getWebElement(String type,String selector)
	{
		WebDriverWait wait=new WebDriverWait(wd,Long.parseLong(getProperties("explicitwait")));
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(getElementType(type,selector)));
		return element;
	}

	public static List<WebElement> getWebElements(String type,String selector)
	{
		return wd.findElements(getElementType(type,selector));
	}
	
	public static void elementClick(String element)
	{
		if(element!=null)
		{
			getWebElement("xpath",element).click();
		}
	}
	
	public static void elementClick()
	{
		if(element!=null)
		{
			element.click();
		}
	}
	
	public static void fillElement(WebElement element,String value)
	{
		if(element!=null)
		{
			element.sendKeys(value);
		}
	}
	
	public static void fillElement(String value)
	{
		if(element!=null)
		{
			element.sendKeys(value);
		}
	}
	
	public static void fillElement(String selector,String value)
	{
		if(selector!=null)
		{
			getWebElement("xpath",selector).sendKeys(value);
		}
	}
	public static By getElementType(String type,String selector)
	{
		switch(type)
		{
			case "xpath":
				return By.xpath(selector);
			case "css":
				return By.cssSelector(selector);
			case "id":
				return By.id(selector);
			case "class":
				return By.className(selector);
			default:
				return null;
		}
	}
	
	public static Properties loadProperties()
	{
		Properties p=null;
		try {
			FileReader file=new FileReader("project.properties");
			p=new Properties();
			p.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;	
	}
	
	public static String getProperties(String value)
	{
		return p.getProperty(value);
	}
	
	public static void close()
	{
		wd.close();
	}
}
