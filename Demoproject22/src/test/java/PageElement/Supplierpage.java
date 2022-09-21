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

public class Supplierpage {
	WebDriver driver;
	Readanexcel objexcel=new Readanexcel();
	public Supplierpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/a/span[1]")
	public WebElement people;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/ul/li[3]/a/span")
	public WebElement supplier;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addsupplier;
	@FindBy(id="SupplierName")
	public WebElement suppliername;
	@FindBy(id="SupplierPhone")
	public WebElement supplierphone;
	@FindBy(id="SupplierEmail")
	public WebElement supplieremail;
	@FindBy(xpath="//*[@id=\"AddSupplier\"]/div/div/form/div[1]/div[4]/div/div[3]/div[2]")
	public WebElement description;
	@FindBy(xpath="//*[@id=\"AddSupplier\"]/div/div/form/div[2]/button[2]")
	public WebElement submitt;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement search;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement entermessage;
	

	public void supplierdetail()throws InterruptedException,IOException{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
   	 clickhelper obbj=new clickhelper();
		obbj.click( people);
		 objwait.waitin();
		 obbj.click( supplier);
    	 objwait.waitin();
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		js.executeScript("scroll(0,300);");
 		objwait.waitin();
 		js.executeScript("scroll(0,-300);");
 		objwait.waitin();
 		 obbj.click( addsupplier);
 		objwait.waitin();
	}
	public void addsupplier()throws Exception{
		waitconditions objwait = new waitconditions();
   	    objwait.waitin();
   	    sendkeyshelper obb=new sendkeyshelper();
 	    obb.sendKeys(driver, suppliername, "anu");
		objwait.waitin();
		obb.sendKeys(driver, supplierphone, "765438");
		objwait.waitin();
		obb.sendKeys(driver, supplieremail,objexcel.Readanexcel(0, 0) );
		objwait.waitin();
		obb.sendKeys(driver, description, "good delivery");
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
 	    obb.sendKeys(driver, entermessage, "anu");
		objwait.waitin();
	}
}
