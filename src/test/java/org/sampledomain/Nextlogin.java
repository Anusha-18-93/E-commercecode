
                       //LOGIN




package org.sampledomain;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nextlogin extends Base
{
	public Nextlogin()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='ms-button2 ms-button2--tertiary ms-button2--size_medium ms-login-logout__logout-button']")
	private List<WebElement> klking;
	
	public List<WebElement> getKlking() {
		return klking;
	}


}
