

                  //PRODUCT CONFIRMATION



package org.sampledomain;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productdetails extends Base
{
	public Productdetails()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='layer-close']")
	private List<WebElement> detailsklk;
	 
	

	public List<WebElement> getDetailsklk() {
		return detailsklk;
	}
	
	
	


}
