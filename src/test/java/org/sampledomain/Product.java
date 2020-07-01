package org.sampledomain;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product extends Base {
	public Product()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//select[@name='select[qty]']")
	private List<WebElement> productno;

public List<WebElement> getProductno() {
	return productno;
}


}
