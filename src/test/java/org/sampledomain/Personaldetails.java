
                   //SHIPPING ADDRESS



package org.sampledomain;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personaldetails extends Base 
{
	public Personaldetails()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='firstName']")
	private List<WebElement> firstname1;
	
	@FindBy(xpath="//input[@name='lastName']")
	private List<WebElement> lastname1;
	
	@FindBy(xpath="//input[@class='short ng-scope ng-valid-pattern ng-valid-maxlength ng-dirty ng-valid-parse ng-invalid ng-valid-server ng-invalid-required ng-valid-minlength skipped ng-touched']")
	private List<WebElement> pincode;
	
	@FindBy(xpath="//input[@name='city']")
	private List<WebElement> cityname;
	
	@FindBy(xpath="//input[@name='street']")
	private List<WebElement> streetname;
	
	@FindBy(xpath="//input[@name='housenumber']")
	private List<WebElement> houseno;
	

	@FindBy(xpath="//input[@name='country']")
	private List<WebElement> countryname;
	
	
	@FindBy(xpath="//input[@id='nextButton']")
	private List<WebElement> submit;


	public List<WebElement> getFirstname1() {
		return firstname1;
	}


	public List<WebElement> getLastname1() {
		return lastname1;
	}


	public List<WebElement> getPincode() {
		return pincode;
	}


	public List<WebElement> getCityname() {
		return cityname;
	}


	public List<WebElement> getStreetname() {
		return streetname;
	}


	public List<WebElement> getHouseno() {
		return houseno;
	}


	public List<WebElement> getCountryname() {
		return countryname;
	}


	public List<WebElement> getSubmit() {
		return submit;
	}
	
}

