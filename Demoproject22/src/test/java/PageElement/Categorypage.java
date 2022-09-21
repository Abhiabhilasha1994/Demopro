package PageElement;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.clickhelper;
import Utilities.sendkeyshelper;
import Utilities.waitconditions;

public class Categorypage {
	WebDriver driver;
	
	public  Categorypage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[7]/a/span[1]")
	public WebElement category;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[7]/ul/li[1]/a/span")
	public WebElement product;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addcategory;
	@FindBy(id="CategoryName")
	public WebElement categoryname;
	@FindBy(xpath="//*[@id=\"Addcategory\"]/div/div/form/div[2]/button[2]")
	public WebElement submitt;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement search;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement entermessage;



	public void categorydetails()throws InterruptedException,IOException{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
   	 clickhelper obbj=new clickhelper();
		obbj.click( category);
	    objwait.waitin();
	    obbj.click(product);
		 objwait.waitin();
		
	}
	public void addcategory()throws Exception{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,300);");
		 objwait.waitin();
		js.executeScript("scroll(0,-300);");
		 objwait.waitin();
		 clickhelper obbj=new clickhelper();
		obbj.click (addcategory);
		 objwait.waitin();
		 sendkeyshelper obb=new sendkeyshelper();
	     obb.sendKeys(driver, categoryname , "vegetables");
		 objwait.waitin();
		 obbj.click (submitt);
		 objwait.waitin();
	}
	public void searchbutton()throws Exception{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
		Actions objaction=new Actions(driver);
		 objwait.waitin();
		objaction.click(search);
		 objwait.waitin();
		objaction.build().perform();
		 objwait.waitin();
		sendkeyshelper obb=new sendkeyshelper();
	     obb.sendKeys(driver,entermessage  , "vegetables");
	     objwait.waitin();
		
	}
}
