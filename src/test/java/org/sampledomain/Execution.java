package org.sampledomain;


import org.testng.annotations.Test;

public class Execution extends Base 
{
	@Test(dataProviderClass=Dataprovider.class,dataProvider="loginInfo")
	public void test1(String s1,String s2) throws InterruptedException 
	{
	launch("https://www.saturn.de/de/shop/weekend-deals.html");
	driver.manage().window().maximize();
	
	Login l=new Login();
	klk(l.getPress().get(0));
	Thread.sleep(4000);
	 
	Nextlogin n=new Nextlogin();
	klk(n.getKlking().get(0));
	
	Logindetails ld=new Logindetails();
	fill(ld.getLogin(),s1);
	fill(ld.getPwd(),s2);
	klk(ld.getLoginbtn());
	Thread.sleep(3000);
	}
	@Test(dataProviderClass=Dataprovider.class,dataProvider="searching")
	public void test2(String s3) throws InterruptedException
	{
	Home h=new Home();
	fill(h.getSearch().get(0),s3);
	klk(h.getBtn().get(0));
	Thread.sleep(3000);
	
	}
   
    @Test()
    public void test3() throws InterruptedException 
	{
    Cart c=new Cart();
	klk(c.getAdd().get(0));
	Thread.sleep(3000);
	
	}
    @Test()
	public void test4() 
	{
	Productdetails p=new Productdetails();
	klk(p.getDetailsklk().get(0));
	}
	@Test()
	public void test5()
	{
	Close cl=new Close();
   klk(cl.getClose().get(0));
	}
   @Test()
	public void test6() throws InterruptedException
	{
	   
	Confirm cn=new Confirm();
  klk(cn.getConfirmbtn().get(0));
  Thread.sleep(3000);
  
}
   @Test(dataProviderClass=Dataprovider.class,dataProvider="buying")
  	public void test7(String s9) throws InterruptedException
  	{
  	Product pp =new Product();
    drop(pp.getProductno().get(0),s9);
    Thread.sleep(3000);
  	}
   @Test(dataProviderClass=Dataprovider.class,dataProvider="details")
   public void test8(String s4,String s5,String s6,String s7,String s8)
   {
	 Personaldetails p=new Personaldetails();
	 fill(p.getPincode().get(0),s4);
	 fill(p.getCityname().get(0),s5);
     fill(p.getStreetname().get(0),s6);
     fill(p.getHouseno().get(0),s7);
     fill(p.getCountryname().get(0),s8);
     klk(p.getSubmit().get(0));
}

}  
