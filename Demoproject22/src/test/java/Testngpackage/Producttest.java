package Testngpackage;

import org.testng.annotations.Test;

import PageElement.Loginpage;
import PageElement.Productpage;
import Utilities.webdrivermanager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Producttest  extends webdrivermanager{
	static WebDriver driver;
	webdrivermanager obj;
	Loginpage obj12;
	Productpage obj13;
  @Test(priority=3,enabled=true,groups= {"functional"})
  public void productpage() throws Exception {
	  driver=webdrivermanager.driver;
		  obj13=new Productpage(driver);
	 // obj12.Logindetail();
	  obj13.productdetail();
	  String expectedurl="https://qalegend.com/restaurant/products";
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
  @Test(priority=4,enabled=true,groups= {"functional"})
  public void addproduct() throws Exception {
	  obj13.addproductdetail();
	 WebElement price=driver.findElement(By.id("Price"));
	 Assert.assertEquals(true, price.isDisplayed());
	// System.out.println("pass");
  }
  @Test(priority=5,enabled=true,groups= {"functional"})
  public void dropdownpage() throws InterruptedException, IOException {
	  obj13.Dropdown();
	  String expectedtext="";
	   WebElement actualtext=driver.findElement(By.xpath("//*[@id=\"Category\"]"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	   //System.out.println(" Assert passed");
	  
  }
 
  
  @Test(priority=6,enabled=false,groups= {"functional"})
  public void uploadfile() throws Exception {
	  obj13.uploadfiles();
  }
  @Test(priority=7,enabled=true,groups= {"functional"})
  public void stockpage() throws Exception {
	  obj13.storedetails();
	  WebElement submitt=driver.findElement(By.xpath("//*[@id=\"stockModal\"]/div/div[3]/button[2]"));
		 Assert.assertEquals(true, submitt.isEnabled());
		 //System.out.println("pass");
	 
	  
  }
  @Test(priority=8,enabled=true,groups= {"functional"})
  public void searchpage() throws Exception {
	  obj13.searchbutton();
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"Table_filter\"]/label/input"));
		 Assert.assertEquals(true, search.isDisplayed());
		// System.out.println("pass");
	 
	 
	
  }
  
 // @BeforeTest
//  public void beforeTest() {
	//  launchbrowser("chrome","https://qalegend.com/restaurant/");
	//  driver=webdrivermanager.driver;
	//  obj13=new Productpage(driver);
	 // obj12=new Loginpage(driver);
// }

 //@AfterTest
 //public void afterTest() {
	  //driver.close();
 // }

}
