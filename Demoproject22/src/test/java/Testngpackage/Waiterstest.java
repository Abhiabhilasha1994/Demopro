package Testngpackage;

import org.testng.annotations.Test;

import PageElement.Loginpage;
import PageElement.Waiterspage;
import Utilities.Readanexcel;
import Utilities.webdrivermanager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Waiterstest extends webdrivermanager{
	static WebDriver driver;
	webdrivermanager obj;
	Loginpage obj12;
	Waiterspage obj14;
  @Test(priority=12,enabled=true,groups= {"functional"} )
  public void waitersdetail() throws Exception {
	  driver=webdrivermanager.driver;
	  obj14=new Waiterspage(driver);
	 // obj12.Logindetail();
	  obj14.waiterdetail();
	  String expectedurl="https://qalegend.com/restaurant/waiters";
	  String actualurl=driver.getCurrentUrl();
	  if(actualurl.contains(expectedurl)) {
		  System.out.println("test passed");
	  }
	  else {
		  System.out.println("test failed");
	  }
	  Assert.assertEquals(actualurl, expectedurl);
	  //System.out.println("details to check assert");
  }
  @Test(priority=13,enabled=true,groups= {"functional"})
  public void addwaiters() throws Exception {
	  Boolean status=false;
	  Readanexcel objexcel=new Readanexcel();
	 obj14.addwaiterdetail();
	 String expectedtext="";
	   WebElement actualtext=driver.findElement(By.xpath("//*[@id=\"WaiterName\"]"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	  // System.out.println(" Assert passed");
	
  }
  @Test(priority=14,enabled=true,groups= {"functional"})
  public void dropdown() throws InterruptedException, IOException {
	obj14.dropdown();
	 WebElement store=driver.findElement(By.id("WaiterStore"));
	 Assert.assertEquals(false, store.isDisplayed());
	// System.out.println("pass");
	
  }
  @Test(priority=15,enabled=true,groups= {"functional"})
  public void searchoption() throws Exception {
	obj14.searchbutton();
	 WebElement search=driver.findElement(By.xpath("//*[@id=\"Table_filter\"]/label/input"));
	 Assert.assertEquals(true, search.isDisplayed());
	 //System.out.println("pass");
 
  }
  //@BeforeTest
 // public void beforeTest() {
	 // launchbrowser("chrome","https://qalegend.com/restaurant/");
	//  driver=webdrivermanager.driver;
	//  obj12=new Loginpage(driver);
	//  obj14=new Waiterspage(driver);
//  }

 // @AfterTest
 // public void afterTest() {
//	  driver.close();
 // }

}
