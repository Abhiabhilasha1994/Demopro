package Testngpackage;

import org.testng.annotations.Test;

import PageElement.Loginpage;
import PageElement.Supplierpage;
import Utilities.Readanexcel;
import Utilities.webdrivermanager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Suppliertest extends webdrivermanager{
	webdrivermanager obj;
	Loginpage obj12;
	 Supplierpage obj16;
  @Test(priority=19,enabled=true,groups= {"functional"})
  public void supplierpage()throws Exception {
	  driver=webdrivermanager.driver;
	  obj16=new Supplierpage(driver);
	  //obj12.Logindetail();
	  obj16.supplierdetail();
	  String expectedtitle="POS - point of sale Presto Cafeteria";
		 String actualtitle=driver.getTitle();
		 if(actualtitle.contains(expectedtitle)) {
			  System.out.println("test passed");
		  }
		  else {
			  System.out.println("test failed");
		  }
		  Assert.assertEquals(actualtitle, expectedtitle);
		//  System.out.println("details to check assert");
  }
  @Test(priority=20,enabled=true,groups= {"functional"})
  public void addsupplierdetail()throws Exception {
	  Readanexcel objexcel=new Readanexcel();
	  obj16.addsupplier();
	  String expectedtext="";
	   WebElement actualtext=driver.findElement(By.xpath("//*[@id=\"SupplierName\"]"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	  // System.out.println(" Assert passed");
  }
  @Test(priority=21,enabled=true,groups= {"functional"})
  public void searchsupplier()throws Exception {
	  obj16.searchbutton();
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"Table_filter\"]/label/input"));
		 Assert.assertEquals(true, search.isDisplayed());
		// System.out.println("pass");
  }
 // @BeforeTest
  //public void beforeTest() {
	  //launchbrowser("chrome","https://qalegend.com/restaurant/");
	 // driver=webdrivermanager.driver;
	 // obj12=new Loginpage(driver);
	 // obj16=new Supplierpage(driver);
//  }

 // @AfterTest
 // public void afterTest() {
	//  driver.close();
 // }

}
