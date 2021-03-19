package PageClass;

import Main.Utilities;
import PageObject.AmazonObjects;
import PageObject.DarazObjects;

public class MainEcomTest {
	
	public void amazonSearch()
	{
		String url=(String) Utilities.getProperties("amazon");
		Utilities.goToPage(url);
		AmazonObjects amazon=new AmazonObjects(Utilities.wd);
		amazon.fillSearch("laptops on sale");
		amazon.clickSearch();
		amazon.showAllResult();
	}
	
	public void darazSearch()
	{
		String url=(String) Utilities.getProperties("daraz");
		Utilities.goToPage(url);
		DarazObjects amazon=new DarazObjects(Utilities.wd);
		amazon.fillSearch("laptop apply");
		amazon.clickSearch();
		amazon.showAllResult();
	}

}
