package PageElement;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.clickhelper;
import Utilities.sendkeyshelper;
import Utilities.waitconditions;

public class Settingpage {
	WebDriver driver;

	public Settingpage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[8]/a/span")
	public WebElement setting;
	@FindBy(id="numberDecimal")
	public WebElement decimal;
	@FindBy(name="timezone")
	public WebElement place;
	@FindBy(xpath="//*[@id=\"summernote\"]")
	public WebElement text1;
	@FindBy(xpath="//*[@id=\"summernote2\"]")
	public WebElement text2;
	
	@FindBy(xpath="//*[@id=\"setting\"]/form/div[15]/button")
	public WebElement submitt;
	
	
	public void detailsdrop()throws InterruptedException,IOException{
		waitconditions objwait = new waitconditions();
		objwait.waitin();
		clickhelper obbj=new clickhelper();
		obbj.click(setting);
		objwait.waitin();
		Select objdrop=new Select(decimal);
		objwait.waitin();
		objdrop.selectByValue("Rupee");
		Select objdrop1=new Select(place);
		objdrop1.selectByValue("0.001");
		objwait.waitin();
		
		
	}
	public void textdata()throws InterruptedException,IOException{
		waitconditions objwait = new waitconditions();
		objwait.waitin();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,300);");
		objwait.waitin();
		js.executeScript("scroll(0,-300);");
		objwait.waitin();
		clickhelper obbj=new clickhelper();
		obbj.click(submitt);
		objwait.waitin();
	}

}
