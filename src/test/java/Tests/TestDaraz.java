package Tests;

import org.testng.annotations.Test;
import PageClass.MainEcomTest;

public class TestDaraz extends BaseTest 
{
		@Test
		public void daraztest()
		{
			MainEcomTest ecom=new MainEcomTest();
			ecom.darazSearch();
		}
}
