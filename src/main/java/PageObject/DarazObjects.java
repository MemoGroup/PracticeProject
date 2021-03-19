package PageObject;

import java.util.List;
import java.util.ListIterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Enums.DarazSelectors;
import Main.Utilities;

public class DarazObjects 
{
	   WebDriver driver=null;
	   public DarazObjects(WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void fillSearch(String value)
	   {
		   String search=DarazSelectors.XPATH_DARAZ_SEARCH_FIELD.getValue();
		   System.out.println(search);
		   Utilities.fillElement(search,value); 
	   }
		
	   public void clickSearch()
	   {
		   String search=DarazSelectors.XPATH_DARAZ_SEARCH_BUTTON.getValue();
		   Utilities.elementClick(search); 
	   }
	   
	   public void showAllResult()
	   {
		   String result=DarazSelectors.XPATH_DARAZ_SEARCH_RESULT.getValue();
		   List<WebElement> results=Utilities.getWebElements("xpath", result);
		   ListIterator<WebElement> products=results.listIterator();
		   while(products.hasNext())
		   {
			   System.out.println(products.next().getText());
		   }
	   }
}
