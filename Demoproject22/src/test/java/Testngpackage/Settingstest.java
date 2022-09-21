package Testngpackage;

import org.testng.annotations.Test;

import PageElement.Loginpage;
import PageElement.Settingpage;
import Utilities.webdrivermanager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Settingstest extends webdrivermanager{

	static WebDriver driver;
	webdrivermanager obj;
	Loginpage obj12;
	Settingpage obj19;
  @Test(priority=30,enabled=true,groups= {"functional"})
  public void settingslogo() throws Exception {
	  driver=webdrivermanager.driver;
	  obj19=new Settingpage(driver);
	 // obj12.Logindetail();
	  obj19.detailsdrop();
	  WebElement currencycode=driver.findElement(By.xpath("//*[@id=\"currency\"]"));
		 Assert.assertEquals(true, currencycode.isDisplayed());
		// System.out.println("pass");
	  
  }
  @Test(priority=31,enabled=true,groups= {"functional"})
  public void settingslogodetails() throws InterruptedException, IOException {
	  obj19.textdata();
	  WebElement submitt=driver.findElement(By.xpath("//*[@id=\"setting\"]/form/div[15]/button"));
		 Assert.assertEquals(true, submitt.isEnabled());
		// System.out.println("pass");
  }
 // @BeforeTest
//  public void beforeTest() {
	//  launchbrowser("chrome","https://qalegend.com/restaurant/");
	//  driver=webdrivermanager.driver;
	//  obj12=new Loginpage(driver);
	 // obj19=new Settingpage(driver);
	  
 // }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
