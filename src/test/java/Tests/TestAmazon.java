package Tests;

import org.testng.annotations.Test;
import PageClass.MainEcomTest;

public class TestAmazon extends BaseTest 
{
	@Test
	public void amazontest()
	{
		MainEcomTest ecom=new MainEcomTest();
		ecom.amazonSearch();
	}

}
