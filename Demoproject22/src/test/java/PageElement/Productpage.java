package PageElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.clickhelper;
import Utilities.sendkeyshelper;
import Utilities.waitconditions;



public class Productpage {
	WebDriver driver;
	public Productpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[2]/a/span")
	public WebElement product;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addproduct;
	@FindBy(name="type")
	public WebElement dropdown1;
	@FindBy(id="ProductCode")
	public WebElement code;
	@FindBy(id="ProductName")
	public WebElement name;
	@FindBy(name="category")
	public WebElement dropdown2;
	@FindBy(name="supplier")
	public WebElement dropdown3;
	@FindBy(xpath="//*[@id=\"PurchasePrice\"]")
	public WebElement purchaseprice;
	@FindBy(name="tax")
	public WebElement tax;
	@FindBy(id="taxType")
	public WebElement dropdown5;
	@FindBy(xpath="//*[@id=\"Price\"]")
	public WebElement price;
	@FindBy(name="unit")
	public WebElement productunit;
	@FindBy(xpath="//*[@id=\"AlertQt\"]")
	public WebElement alert;
	@FindBy(xpath="//*[@id=\"ProductOptions\"]")
	public WebElement productoption;
	@FindBy(xpath="//*[@id=\"ImageInput\"]")
	public WebElement choosefile;
	@FindBy(xpath="//*[@id=\"addform\"]/div[1]/div[14]/div/div[3]/div[2]")
	public WebElement productdescription;
	@FindBy(xpath="//*[@id=\"addform\"]/div[2]/button[2]")
	public WebElement submitt;
	@FindBy(xpath="//*[@id=\"quantity\"]")
	public WebElement storequantity;
	@FindBy(id="pricestr")
	public WebElement storeprice;
	@FindBy(xpath="//*[@id=\"stockModal\"]/div/div[3]/button[2]")
	public WebElement submitt1;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement search;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement entermessage;
	@FindBy(xpath="//table[@id='Table']/tbody/tr[7]/td[2]")
	public WebElement table;
	

    
	
	public void productdetail()throws InterruptedException,IOException{
		waitconditions objwait = new waitconditions();
		objwait.waitin();
		clickhelper obbj=new clickhelper();
		obbj.click(product);
		objwait.waitin();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,300);");
		objwait.waitin();
		js.executeScript("scroll(0,-300);");
		objwait.waitin();
		obbj.click(addproduct);
		objwait.waitin();
		
		
	}
	
	public void addproductdetail()throws Exception{
		waitconditions objwait = new waitconditions();
		objwait.waitin();
		sendkeyshelper obb=new sendkeyshelper();
		obb.sendKeys(driver,code , "444");
		objwait.waitin();
		obb.sendKeys(driver,name , "amal");
		objwait.waitin();
		obb.sendKeys(driver,tax , "76");
		objwait.waitin();
		obb.sendKeys(driver,productunit , "aaas");
		objwait.waitin();
		obb.sendKeys(driver,productoption ,"more cheese" );
		objwait.waitin();
		obb.sendKeys(driver,productdescription ,"good product" );
		objwait.waitin();
		obb.sendKeys(driver,price ,"10" );
		objwait.waitin();
		
		
		
	}
	public void Dropdown()throws InterruptedException,IOException{
		waitconditions objwait = new waitconditions();
		objwait.waitin();
		Select objdrop=new Select(dropdown1);
		objwait.waitin();
		objdrop.selectByIndex(0);
		objwait.waitin();
		
		Select objdrop1=new Select(dropdown2);
		objdrop1.selectByVisibleText("vegetables");
		objwait.waitin();
		Select objdrop2=new Select(dropdown3);
		objdrop2.selectByValue("agmark");
		objwait.waitin();
		Select objdrop4=new Select(dropdown5);
		objdrop4.selectByIndex(1);
		objwait.waitin();
		clickhelper obbj=new clickhelper();
		obbj.click(submitt);
		objwait.waitin();
	}
	
	
	public void uploadfiles()throws InterruptedException,IOException, AWTException{
		
		waitconditions objwait = new waitconditions();
		objwait.waitin();
		objwait.waitin();
//		clickhelper ob=new clickhelper();
//		ob.clickUsingJS(driver, choosefile);
		objwait.waitin();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.id("ImageInput")));
//		driver.findElement(By.id("ImageInput")).sendKeys("C:\\Users\\GOKUL\\Pictures\\Saved Pictures\\picsss.jpeg");
		//choosefile.sendKeys(UN);
		//objwait.waitin();
		//submitt.click();
		
		
		 StringSelection ss = new StringSelection("C:\\Users\\GOKUL\\Pictures\\Saved Pictures\\picsss.jpeg");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    // imitate mouse events like ENTER, CTRL+C, CTRL+V
	     Robot robot = new Robot();
	     robot.delay(3000);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(3000);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	   
	  // submitt.click();
	   
		
	}
	
	public void storedetails()throws Exception{

		waitconditions objwait = new waitconditions();
		objwait.waitin();
		storequantity.clear();
	    objwait.waitin();
	    sendkeyshelper obb=new sendkeyshelper();
	    obb.sendKeys(driver, storequantity,"6");
		objwait.waitin();
		storeprice.clear();
		objwait.waitin();
		obb.sendKeys(driver,storeprice , "17");
		objwait.waitin();
		clickhelper obbj=new clickhelper();
		obbj.click(submitt1);
		objwait.waitin();
		
		
		
		
	}
	public void searchbutton()throws Exception{
		waitconditions objwait = new waitconditions();
		objwait.waitin();
		clickhelper obbj=new clickhelper();
		obbj.click(search);
		objwait.waitin();
		sendkeyshelper obb=new sendkeyshelper();
		obb.sendKeys(driver,entermessage , "amal");
		objwait.waitin();
	
	}
}
