package PageElement;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.clickhelper;
import Utilities.sendkeyshelper;
import Utilities.waitconditions;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	public WebElement Username;
	@FindBy(name="password")
	public WebElement Password;
	@FindBy(name="submit")
	public WebElement Login;
	
	
	public void failedlogin(String us, String pw)throws Exception{
		waitconditions objwait = new waitconditions();
		objwait.waitin();
		sendkeyshelper obb=new sendkeyshelper();
		obb.sendKeys(driver, Username, "admin");
		objwait.waitin();
		obb.sendKeys(driver,Password , pw);
		objwait.waitin();
		clickhelper obbj=new clickhelper();
		obbj.click(Login);
		objwait.waitin();
		objwait.waitin();
		Username.clear();
		objwait.waitin();
	}
	

	public void Logindetail()throws Exception{
		waitconditions objwait = new waitconditions();
		objwait.waitin();
		sendkeyshelper obb=new sendkeyshelper();
		obb.sendKeys(driver, Username, "admin");
		objwait.waitin();
		obb.sendKeys(driver,Password , "password");
		objwait.waitin();
		clickhelper obbj=new clickhelper();
		obbj.click(Login);
		objwait.waitin();
		
		
	}

	

	

	


	
}
