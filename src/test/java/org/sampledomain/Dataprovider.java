package org.sampledomain;

import org.testng.annotations.DataProvider;


public class Dataprovider
{
	@DataProvider(name="loginInfo")
	public Object[][] dataProvider()
	{
		return new Object[][]
				{
			{"ranusha.93@gmail.com","Jothir18"}
				};
	}
	@DataProvider(name="searching")
	public Object[][] searching()
	{
		return new Object[][]
				{
			{"APPLE WATCH"}
				};
	}
	@DataProvider(name="buying")
	public Object[][] buying()
	{
		return new Object[][]
				{
			{"2"}
				};
	}

	@DataProvider(name="details")
	public Object[][] details1()
	{
		return new Object[][]
				{
			{"10117","Berlin","Schulstraﬂe","101","Deutschland"}
				};
	}
	
	}


