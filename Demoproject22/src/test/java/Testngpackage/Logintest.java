package Testngpackage;

import org.testng.annotations.Test;

import PageElement.Loginpage;
import PageElement.Productpage;
import Utilities.webdrivermanager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Logintest extends webdrivermanager {
	static WebDriver driver;
	webdrivermanager obj;
	Loginpage obj12;
	
	
	  @Test(priority=1,enabled=true,groups={"functional"},dataProvider="Search Provider",dataProviderClass=Dataprovider .class)
	  public void invalidlogin(String us, String pw) throws Exception {
		  driver=webdrivermanager.driver;
		  obj12=new Loginpage(driver);
		  obj12.failedlogin(us, pw);
		  String expectedurl="https://qalegend.com/restaurant/login";
		  String actualurl=driver.getCurrentUrl();
		  if(actualurl.contains(expectedurl)) {
			  System.out.println("test passed");
		  }
		  else {
			  System.out.println("test failed");
		  }
		  Assert.assertEquals(actualurl, expectedurl);
		 // System.out.println("details to check assert");
	  
		 
	  }
	
  @Test(priority=2,enabled=true,groups={"functional"})
  public void verifylogin() throws Exception {
	  driver=webdrivermanager.driver;
		  obj12=new Loginpage(driver);
	obj12.Logindetail();
	  String expectedurl="https://qalegend.com/restaurant/";
	  String actualurl=driver.getCurrentUrl();
	  if(actualurl.contains(expectedurl)) {
		  System.out.println("test passed");
	  }
	  else {
		  System.out.println("test failed");
	  }
	  Assert.assertEquals(actualurl, expectedurl);
	 // System.out.println("details to check assert");
  }
 
  @BeforeTest
  @Parameters({"Browser" ,"Url"})
public void beforeTest(String Browser,String Url) {	
		launchbrowser(Browser,Url);
 
	//  launchbrowser("chrome","https://qalegend.com/restaurant/");
	//  driver=webdrivermanager.driver;
	 // obj12=new Loginpage(driver);
	 
  }

//  @AfterTest
// public void afterTest() {
	//  driver.close();
 // }

}
