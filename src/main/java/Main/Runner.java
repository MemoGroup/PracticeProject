package Main;

import org.openqa.selenium.WebDriver;

public class Runner {

	public static void main(String[] args)
	{
		WebDriver driver=Driver.getDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
