package Testngpackage;

import org.testng.annotations.Test;

import PageElement.Customerspage;
import PageElement.Loginpage;
import Utilities.webdrivermanager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Customerstest extends webdrivermanager{

	static WebDriver driver;
	webdrivermanager obj;
	Loginpage obj12;
	 Customerspage obj15;
  @Test(priority=16,enabled=true,groups= {"functional"})
  public void customersdetail() throws Exception{
	  driver=webdrivermanager.driver;
	  obj15=new Customerspage(driver);
	 // obj12.Logindetail();
	  obj15.customerdetail();
	  String expectedtitle="POS - point of sale Presto Cafeteria";
		 String actualtitle=driver.getTitle();
		 if(actualtitle.contains(expectedtitle)) {
			  System.out.println("test passed");
		  }
		  else {
			  System.out.println("test failed");
		  }
		  Assert.assertEquals(actualtitle, expectedtitle);
		 // System.out.println("details to check assert");
	  
  }
  @Test(priority=17,enabled=true,groups= {"functional"})
  public void addcustomer() throws Exception{
	  obj15.addcustomer();
	  WebElement addcustomer=driver.findElement(By.xpath("/html/body/div[2]/button"));
		 Assert.assertEquals(true, addcustomer.isEnabled());
		// System.out.println("pass");
	 
	  
  }
  @Test(priority=18,enabled=true,groups= {"functional"})
  public void searchcustomer() throws Exception{
	  obj15.searchbutton();
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"Table_filter\"]/label/input"));
		 Assert.assertEquals(true, search.isDisplayed());
		// System.out.println("pass");
	  
	  
  }
 // @BeforeTest
 // public void beforeTest() {
	//  launchbrowser("chrome","https://qalegend.com/restaurant/");
	//  driver=webdrivermanager.driver;
	//  obj12=new Loginpage(driver);
  // obj15=new Customerspage(driver);
 // }

 // @AfterTest
// public void afterTest() {
	//  driver.close();
// }

}
