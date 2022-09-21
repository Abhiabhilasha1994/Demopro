package PageElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class Expensepage {
	WebDriver driver;
	public Expensepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[6]/a/span")
	public WebElement expense;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addexpense;
	@FindBy(id="Date")
	public WebElement date;
	@FindBy(id="Reference")
	public WebElement reference;
	@FindBy(id="Category")
	public WebElement dropdown;
	@FindBy(id="store_id")
	public WebElement dropdown2;
	@FindBy(id="Amount")
	public WebElement amount;
	@FindBy(xpath="//*[@id=\"attachment\"]")
	public WebElement choosefile;
	@FindBy(xpath="//*[@id=\"addform\"]/div[1]/div[7]/div/div[3]/div[2]")
	public WebElement description;
	@FindBy(xpath="//*[@id=\"addform\"]/div[2]/button[2]")
	public WebElement submitt;
	@FindBy(xpath="//*[@id=\"table_filter\"]/label/input")
	public WebElement search;
	@FindBy(xpath="//*[@id=\"table_filter\"]/label/input")
	public WebElement entermessage;


	
	public void expensepage()throws InterruptedException,IOException{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
   	 clickhelper obbj=new clickhelper();
		obbj.click(expense);
		 objwait.waitin();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,300);");
		 objwait.waitin();
		js.executeScript("scroll(0,-300);");
		 objwait.waitin();
		 obbj.click(addexpense);
		 objwait.waitin();
	}
	public void expensedetails()throws Exception{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
   	    sendkeyshelper obb=new sendkeyshelper();
		obb.sendKeys(driver,date, "2022-09-15");
		 objwait.waitin();
		 obb.sendKeys(driver,reference, "886667");
		 objwait.waitin();
		 obb.sendKeys(driver,amount, "9000");
		 objwait.waitin();
		 obb.sendKeys(driver,description, "very expense");
		 objwait.waitin();
		
	}
	public void uploadfile(String Un)throws InterruptedException,IOException, AWTException{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
   	 Actions objaction=new Actions(driver);
	 objwait.waitin();
	objaction.click(choosefile);
	 objwait.waitin();
	objaction.build().perform();
	choosefile.sendKeys(Un);
	 objwait.waitin();
	submitt.click();
	 objwait.waitin();

		//JavascriptExecutor executor = (JavascriptExecutor)driver;
	   /// executor.executeScript("arguments[0].click();", choosefile);
	    //objwait.waitin();
		//choosefile.click();
		// objwait.waitin();
		
		 
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
	     obb.sendKeys(driver,entermessage, "2022-15-09");
		 objwait.waitin();
		
	}
}
