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

public class Customerspage {
	WebDriver driver;
	//Readanexcel objexcel=new Readanexcel();
	public  Customerspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/a/span[1]")
	public WebElement people;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/ul/li[2]/a/span")
	public WebElement customers;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addcustomers;
	@FindBy(name="name")
	public WebElement customername;
	@FindBy(id="CustomerPhone")
	public WebElement phone;
	@FindBy(id="CustomerEmail")
	public WebElement email;
	@FindBy(id="CustomerDiscount")
	public WebElement discount;
	@FindBy(xpath="//*[@id=\"AddCustomer\"]/div/div/form/div[2]/button[2]")
	public WebElement submitt;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement search;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement entermessage;
    
	public void customerdetail()throws InterruptedException,IOException{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
   	 clickhelper obbj=new clickhelper();
		obbj.click(people);
		objwait.waitin();
		obbj.click(customers);
		objwait.waitin();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,300);");
		js.executeScript("scroll(0,-300);");
		objwait.waitin();
		obbj.click(addcustomers);
		objwait.waitin();
	}
	public void addcustomer()throws Exception{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
   	    sendkeyshelper obb=new sendkeyshelper();
		obb.sendKeys(driver,customername , "akshay");
		objwait.waitin();
		obb.sendKeys(driver,phone , "2345");
		objwait.waitin();
		obb.sendKeys(driver,email , "kiv@gmail.com");
		objwait.waitin();
		obb.sendKeys(driver,discount , "80");
		objwait.waitin();
		clickhelper obbj=new clickhelper();
		obbj.click(submitt);
		objwait.waitin();
	}
	public void searchbutton()throws Exception{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
   	 clickhelper obbj=new clickhelper();
		obbj.click(search);
		objwait.waitin();
		sendkeyshelper obb=new sendkeyshelper();
		obb.sendKeys(driver,entermessage , "akshay");
		objwait.waitin();
	}
}
