package PageElement;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.Readanexcel;
import Utilities.clickhelper;
import Utilities.sendkeyshelper;
import Utilities.waitconditions;

public class Waiterspage {
	WebDriver driver;
	Readanexcel objexcel=new Readanexcel();
	public Waiterspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/a/span[1]")
	public WebElement people;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/ul/li[1]/a/span")
	public WebElement waiters ;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addwaiters ;
	@FindBy(id="WaiterName")
	public WebElement waitername ;
	@FindBy(id="WaiterPhone")
	public WebElement phone ;
	@FindBy(id="WaiterEmail")
	public WebElement email ;
	@FindBy(xpath="//*[@id=\"WaiterStore\"]")
	public WebElement dropdown ;
	@FindBy(xpath="//*[@id=\"AddWaiter\"]/div/div/form/div[2]/button[2]")
	public WebElement submitt ;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement search ;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement entermessage ;
	@FindBy(xpath="/html/body/nav/div/div[1]/a/img")
	public WebElement title ;


     public void waiterdetail()throws InterruptedException,IOException{
    	 waitconditions objwait = new waitconditions();
    	 objwait.waitin();
    	 clickhelper obbj=new clickhelper();
  		obbj.click(people);
    	 objwait.waitin();
    	 obbj.click(waiters);
    	 objwait.waitin();
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		js.executeScript("scroll(0,300);");
 		objwait.waitin();
 		js.executeScript("scroll(0,-300);");
 		objwait.waitin();
 		 obbj.click(addwaiters);
 		objwait.waitin();
     }
     public void addwaiterdetail()throws Exception{
    	 waitconditions objwait = new waitconditions();
    	 objwait.waitin();
    	 sendkeyshelper obb=new sendkeyshelper();
         obb.sendKeys(driver,  waitername , "ammu");
    	 objwait.waitin();
    	 obb.sendKeys(driver,  phone , "233444");
         objwait.waitin();
         obb.sendKeys(driver,  email,objexcel.Readanexcel(0, 0) );
    	 objwait.waitin();
     }
     public void dropdown()throws InterruptedException,IOException{
    	 waitconditions objwait = new waitconditions();
    	 objwait.waitin();
    	 Select objdrop1=new Select(dropdown);
  		objdrop1.selectByIndex(4);
  		objwait.waitin();
  		clickhelper obbj=new clickhelper();
 		obbj.click(	submitt);
  		objwait.waitin();
    	 
     }
     public void searchbutton()throws Exception{
    	 waitconditions objwait = new waitconditions();
    	 objwait.waitin();
    	 clickhelper obbj=new clickhelper();
 		obbj.click(search);
    	 objwait.waitin();
    	 sendkeyshelper obb=new sendkeyshelper();
         obb.sendKeys(driver,   entermessage , "ammu");
    	 objwait.waitin();

     }
   
     
}
