package Enums;

public enum DarazSelectors 
{
	XPATH_DARAZ_SEARCH_BUTTON("//button[contains(@class,'search-box')]"),
	XPATH_DARAZ_SEARCH_FIELD("//*[@id='q']"),
	XPATH_DARAZ_SEARCH_RESULT("//*[@data-tracking='product-card']");
	public String value;
	
	public String getValue()
	{
		return value;
	}
	
	DarazSelectors(String value)
	{
		this.value=value;
	}
}
