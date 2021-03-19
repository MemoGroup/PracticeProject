package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Main.Utilities;

public class BaseTest 
{
	@BeforeTest
	public void init()
	{
		Utilities.init();
	}
	
	@AfterTest
	public void cleanUp()
	{
		Utilities.close();
	}
}
