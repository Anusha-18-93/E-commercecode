  

                      //BASKET


package org.sampledomain;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Close extends Base{
	
	public Close()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@class='ms-button2 ms-button2--primary ms-button2--size_medium ms-shopping-cart__button proceed-button']")
	private List<WebElement> close;
public List<WebElement> getClose() {
	return close;
}

}
