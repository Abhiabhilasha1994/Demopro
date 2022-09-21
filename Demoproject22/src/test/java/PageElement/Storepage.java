package PageElement;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Readanexcel;
import Utilities.clickhelper;
import Utilities.sendkeyshelper;
import Utilities.waitconditions;

public class Storepage {
	WebDriver driver;
	Readanexcel objexcel=new Readanexcel();
	public Storepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[3]/a/span")
	public WebElement store;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addstore;
	@FindBy(id="StoreName")
	public WebElement storename;
	@FindBy(name="email")
	public WebElement email;
	@FindBy(name="phone")
	public WebElement storephone;
	@FindBy(id="Country")
	public WebElement country;
	@FindBy(id="City")
	public WebElement city;
	@FindBy(name="adresse")
	public WebElement address;
	@FindBy(id="CustomeFooter")
	public WebElement receipt;
	@FindBy(xpath="//*[@id=\"AddStore\"]/div/div/form/div[2]/button[2]")
	public WebElement submitt;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement search;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement entermessage;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement resultmessage;
	
	
	


  public void storedetail()throws Exception{
	  waitconditions objwait = new waitconditions();
		objwait.waitin();
		 clickhelper obbj=new clickhelper();
		 obbj.clickUsingJS(driver,  store);
	   // store.click();
	    objwait.waitin();
	    obbj.clickUsingJS(driver, addstore);
	    objwait.waitin();
	  
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scroll(0,300);");
		//Thread.sleep(3000);
		//js.executeScript("scroll(0,-300);");
		//objwait.waitin();
		//addstore.click();
		  
		//objwait.waitin();
  }
 



public void addstoredetail()throws Exception{
	waitconditions objwait = new waitconditions();
	objwait.waitin();
	sendkeyshelper obb=new sendkeyshelper();
	obb.sendKeys(driver, storename , "Ajstoers");
	  objwait.waitin();
	  obb.sendKeys(driver, email , objexcel.Readanexcel(0, 0));
	  objwait.waitin();
	  obb.sendKeys(driver, storephone , "1112233");
	  objwait.waitin();
	  obb.sendKeys(driver, country , "india");
	  objwait.waitin();
	  obb.sendKeys(driver,  city , "tvm");
	  objwait.waitin();
	  clickhelper obbj=new clickhelper();
	  obbj.clickUsingJS(driver, submitt);
	 // submitt.click();
  }
public void searchbutton()throws Exception{
	waitconditions objwait = new waitconditions();
	objwait.waitin();
	 clickhelper obbj=new clickhelper();
	 obbj.clickUsingJS(driver, search);
	//search.click();
	objwait.waitin();
	sendkeyshelper obb=new sendkeyshelper();
	obb.sendKeys(driver,entermessage , "Ajstoers");
	objwait.waitin();
	
	
	
}


}
