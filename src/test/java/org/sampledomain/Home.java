   
               //SEARCHING


package org.sampledomain;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home extends Base
{
	
	public Home()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='query']")
	private List<WebElement> search;
    @FindBy(xpath="//span[@class='ms-icon ms-icon--type_search ms-button2__only-icon']") 
    private List<WebElement> btn;
    
	public List<WebElement> getSearch() 
	{
		return search;
	}
	public List<WebElement> getBtn()
	{
		return btn;
	}
    
}


