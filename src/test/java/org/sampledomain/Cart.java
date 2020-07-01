

                  //ADD TO CART



package org.sampledomain;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends Base
{
	public Cart()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@id='product-list-add-to-cart-6432869']")
	private List<WebElement> add;

	public List<WebElement> getAdd() {
		return add;
	}

	
	

}