package Testngpackage;

import org.testng.annotations.Test;

import PageElement.Categorypage;
import PageElement.Loginpage;
import Utilities.webdrivermanager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Categorytest extends webdrivermanager {

	static WebDriver driver;
	webdrivermanager obj;
	Loginpage obj12;
	Categorypage obj18;
  @Test(priority=27,enabled=true,groups= {"functional"})
  public void categorypages() throws Exception {
	  driver=webdrivermanager.driver;
	  obj18=new Categorypage(driver);
	 // obj12.Logindetail();
	  obj18.categorydetails();
	  String expectedtitle="POS - point of sale Presto Cafeteria";
		 String actualtitle=driver.getTitle();
		 if(actualtitle.contains(expectedtitle)) {
			  System.out.println("test passed");
		  }
		  else {
			  System.out.println("test failed");
		  }
		  Assert.assertEquals(actualtitle, expectedtitle);
		  //System.out.println("details to check assert");
	  
  }
  @Test(priority=28,enabled=true,groups= {"functional"})
  public void categorydetails() throws Exception {
	 obj18.addcategory();
	  WebElement addcategory=driver.findElement(By.xpath("/html/body/div[2]/button"));
		 Assert.assertEquals(true, addcategory.isDisplayed());
		// System.out.println("pass");
	  
  }
  @Test(priority=29,enabled=true,groups= {"functional"})
  public void categorysearch() throws Exception {
	 obj18.searchbutton();
	 WebElement search=driver.findElement(By.xpath("//*[@id=\"Table_filter\"]/label/input"));
	 Assert.assertEquals(true, search.isDisplayed());
	 //System.out.println("pass");
	  
  }
  
 // @BeforeTest
//  public void beforeTest() {
	//  launchbrowser("chrome","https://qalegend.com/restaurant/");
	//  driver=webdrivermanager.driver;
	//  obj12=new Loginpage(driver);
	//  obj18=new Categorypage(driver);
//  }

 // @AfterTest
 // public void afterTest() {
	//  driver.close();
 // }

}
