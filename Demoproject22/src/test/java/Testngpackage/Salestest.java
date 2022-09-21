package Testngpackage;

import org.testng.annotations.Test;

import PageElement.Loginpage;
import PageElement.Salespage;
import Utilities.webdrivermanager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Salestest extends webdrivermanager{
	static WebDriver driver;
	webdrivermanager obj;
	Loginpage obj12;
	 Salespage obj18;
  @Test(priority=26,enabled=true,groups= {"functional"})
  public void salespagedetail()throws Exception {
	  driver=webdrivermanager.driver;
	  obj18=new Salespage(driver);
	  //obj12.Logindetail();
	  obj18.searchbutton();
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input"));
		 Assert.assertEquals(true, search.isEnabled());
		 System.out.println("pass");
	 
	 
	  
  }
 // @BeforeTest
 // public void beforeTest() {
	 // launchbrowser("chrome","https://qalegend.com/restaurant/");
	//  driver=webdrivermanager.driver;
	 // obj12=new Loginpage(driver);
	//  obj18=new Salespage(driver);
 // }

 // @AfterTest
 // public void afterTest() {
	//  driver.close();
  //}

}
