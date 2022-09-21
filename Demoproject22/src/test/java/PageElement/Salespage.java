package PageElement;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.sendkeyshelper;
import Utilities.waitconditions;

public class Salespage {
	WebDriver driver;
	public Salespage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[5]/a/span")
	public WebElement sale;
	@FindBy(xpath="//*[@id=\"table_filter\"]/label/input")
	public WebElement search;
	@FindBy(xpath="//*[@id=\"table_filter\"]/label/input")
	public WebElement entermessage;
	

	public void searchbutton()throws Exception{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
		Actions objaction=new Actions(driver);
		objwait.waitin();
		objaction.click(sale);
		objwait.waitin();
		objaction.build().perform();
		objwait.waitin();
		objaction.click(search);
		objwait.waitin();
		objaction.build().perform();
		objwait.waitin();
		sendkeyshelper obb=new sendkeyshelper();
		obb.sendKeys(driver, entermessage , "John Doe");
		objwait.waitin();
	}
}
