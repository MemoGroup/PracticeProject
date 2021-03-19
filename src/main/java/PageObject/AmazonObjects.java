package PageObject;

import java.util.List;
import java.util.ListIterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Enums.AmazonSelectors;
import Main.Utilities;

public class AmazonObjects {
   WebDriver driver=null;
   public AmazonObjects(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void fillSearch(String value)
   {
	   String search=AmazonSelectors.XPATH_AMAZON_SEARCH_FIELD.getValue();
	   Utilities.fillElement(search,value); 
   }
	
   public void clickSearch()
   {
	   String search=AmazonSelectors.XPATH_AMAZON_SEARCH_BUTTON.getValue();
	   Utilities.elementClick(search); 
   }
   
   public void showAllResult()
   {
	   String result=AmazonSelectors.XPATH_AMAZON_SEARCH_RESULT.getValue();
	   List<WebElement> results=Utilities.getWebElements("xpath", result);
	   ListIterator<WebElement> products=results.listIterator();
	   while(products.hasNext())
	   {
		   System.out.println(products.next().getText());
	   }
   }
}
