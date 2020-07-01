                        //BASE CLASS



package org.sampledomain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

public class Base {
	static WebDriver driver;

	public static void launch(String s)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\Ecommerce1\\div\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(s);
	}
	
	public static void fill(WebElement w,String s)
	{
		w.sendKeys(s);
		}

	public static void klk(WebElement w)
	{
		w.click();
	}

public static void drop(WebElement w,String s)
{
	Select ss=new Select(w);
	ss.selectByVisibleText(s);
	System.out.println(s);
}

}