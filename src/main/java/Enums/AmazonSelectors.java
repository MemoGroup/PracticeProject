package Enums;

public enum AmazonSelectors 
{
	XPATH_AMAZON_SEARCH_BUTTON("//*[@id='nav-search-submit-button']"),
	XPATH_AMAZON_SEARCH_FIELD("//*[@id='twotabsearchtextbox']"),
	XPATH_AMAZON_SEARCH_RESULT("//*[@data-component-type='s-search-result']");
	public String value;
	
	public String getValue()
	{
		return value;
	}
	
	AmazonSelectors(String value)
	{
		this.value=value;
	}
}
