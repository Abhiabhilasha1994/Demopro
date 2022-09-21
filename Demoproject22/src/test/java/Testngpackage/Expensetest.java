package Testngpackage;

import org.testng.annotations.Test;

import PageElement.Expensepage;
import PageElement.Loginpage;
import Utilities.webdrivermanager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Expensetest extends webdrivermanager{
	static WebDriver driver;
	webdrivermanager obj;
	Loginpage obj12;
	Expensepage obj17;
  @Test(priority=22,enabled=true,groups= {"functional"})
  public void expensepages()throws Exception {
	  driver=webdrivermanager.driver;
	  obj17=new Expensepage(driver);
	 // obj12.Logindetail();
	  obj17.expensepage();
	  WebElement addexpense=driver.findElement(By.xpath("/html/body/div[2]/button"));
		 Assert.assertEquals(true,addexpense.isDisplayed());
		// System.out.println("pass");
  }
  @Test(priority=23,enabled=true,groups= {"functional"})
  public void expensepagesdetail()throws Exception {
	  obj17.expensedetails();
	  String expectedtext="";
	   WebElement actualtext=driver.findElement(By.xpath("//*[@id=\"Reference\"]"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	  // System.out.println(" Assert passed");
	  
  }
  @Test(priority=24,enabled=false,groups= {"functional"})
  public void uploadfile()throws InterruptedException, IOException, AWTException {
	  obj17.uploadfile("C:\\Users\\GOKUL\\Pictures\\Saved Pictures\\picsss.jpeg");
	  
  }
  @Test(priority=25,enabled=true,groups= {"functional"})
  public void searchfile()throws Exception {
	  obj17.searchbutton();
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input"));
		 Assert.assertEquals(true, search.isDisplayed());
		 //System.out.println("pass");
	  
  }
  //@BeforeTest
 // public void beforeTest() {
	  //launchbrowser("chrome","https://qalegend.com/restaurant/");
	 // driver=webdrivermanager.driver;
	 /// obj12=new Loginpage(driver);
	  //obj17=new Expensepage(driver);
 // }
 // @AfterTest
// public void afterTest() {
	// driver.close();
 // }

}
