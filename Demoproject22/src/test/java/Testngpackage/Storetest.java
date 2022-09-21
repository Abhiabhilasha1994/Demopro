package Testngpackage;

import org.testng.annotations.Test;

import PageElement.Loginpage;
import PageElement.Storepage;
import Utilities.Readanexcel;
import Utilities.webdrivermanager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Storetest  extends webdrivermanager{
	static WebDriver driver;
	webdrivermanager obj;
	Loginpage obj12;
	Storepage obj14;
  @Test(priority=9,enabled=true,groups= {"functional"})
  public void addstore() throws Exception {
	  driver=webdrivermanager.driver;
	  obj14=new Storepage(driver);
	 // obj12.Logindetail();
	  obj14.storedetail();
	  String expectedurl="https://qalegend.com/restaurant/stores";
	  String actualurl=driver.getCurrentUrl();
	  if(actualurl.contains(expectedurl)) {
		  System.out.println("test passed");
	  }
	  else {
		  System.out.println("test failed");
	  }
	  Assert.assertEquals(actualurl, expectedurl);
	  System.out.println("details to check assert");
  }
  @Test(priority=10,enabled=true,groups= {"functional"})
  public void storedetail() throws Exception {
	  Readanexcel objexcel=new Readanexcel();
	 obj14.addstoredetail();
	 String expectedtitle="POS - point of sale Presto Cafeteria";
	 String actualtitle=driver.getTitle();
	 if(actualtitle.contains(expectedtitle)) {
		  System.out.println("test passed");
	  }
	  else {
		  System.out.println("test failed");
	  }
	  Assert.assertEquals(actualtitle, expectedtitle);
	  System.out.println("details to check assert");
 }
  @Test(priority=11,enabled=true,groups= {"functional"})
  public void searchdetail() throws Exception {
	  
	  obj14.searchbutton();
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"Table_filter\"]/label/input"));
		 Assert.assertEquals(true, search.isDisplayed());
		 System.out.println("pass");
	 
	 
	  
  }
	
  
  //@BeforeTest
 // public void beforeTest() {
	 // launchbrowser("chrome","https://qalegend.com/restaurant/");
	//  driver=webdrivermanager.driver;
	 // obj12=new Loginpage(driver);
	//  obj14=new Storepage(driver);
//  }

 // @AfterTest
  //public void afterTest() {
	 // driver.close();
  //}

}
