
                     //HOME PAGE



package org.sampledomain;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base 
{
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//button[@class='ms-button2 ms-button2--size_medium ms-button2--with-dropdown ms-login-logout__button ms-login-logout__button--logged ms-button2--ghost']")
private List<WebElement> press;


public List<WebElement> getPress() {
	return press;
}







}
