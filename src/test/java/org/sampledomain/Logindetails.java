
                   //LOGIN DETAILS





package org.sampledomain;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logindetails  extends Base
{
	public Logindetails()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="login-email")
	private WebElement login;
	 
	@FindBy(id="login-password")
	private WebElement pwd;
	
	@FindBy(id="my-account-action-login")
	private WebElement loginbtn;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
