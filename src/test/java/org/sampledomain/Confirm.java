
               //CONFIRM PRODUCT



package org.sampledomain;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm extends Base {
	public Confirm()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@class='cobutton cobutton-next']")
private List<WebElement> confirmbtn;
public List<WebElement> getConfirmbtn() {
	return confirmbtn;
}

}
