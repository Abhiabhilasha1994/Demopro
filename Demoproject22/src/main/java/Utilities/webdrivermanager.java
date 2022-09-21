package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class webdrivermanager {
	public String MainWindow;
	public static  WebDriver driver;

	public static void launchbrowser(String Browser, String url) {
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		} else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}
		else if(Browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.edge.driver", "D:\\edger\\edgedriver_win64\\EdgeDriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}
	}

	// implementation alert
	public static Alert alert;

	public void Alertbox(String data, int i) {
		Alert objalert = driver.switchTo().alert();
		objalert.sendKeys(data);
		String result = objalert.getText();
		System.out.println(result);
		if (i == 0) {
			objalert.accept();
		} else if (i == 1) {
			objalert.dismiss();
		}

	}

//implementation popup

	public void PopupMethod(String email) throws InterruptedException {
		MainWindow = driver.getWindowHandle();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				driver.switchTo().window(ChildWindow);

			}
		}

	}

	public void SwitchtoParent() {
		// driver = webdrivermanager.driver;
		driver.switchTo().window(MainWindow);

	}

//implementation of Drag and drop
	public void draganddrop1(WebElement from, WebElement to) throws InterruptedException {

		Actions objactions = new Actions(driver);
		Thread.sleep(3000);
		objactions.dragAndDrop(from, to).build().perform();
	}

//implementation of actions
	public void actions1(WebElement webElement) throws InterruptedException {

		Actions objactions = new Actions(driver);
		objactions.moveToElement(webElement);
		Thread.sleep(3000);
		objactions.click(webElement);
		objactions.clickAndHold();
		Thread.sleep(3000);
		objactions.release().build().perform();
		objactions.moveToElement(webElement).contextClick().build().perform();
	}

//implementation of drop down

public void dropdownbyvalue(By value, String value1) {
		WebElement dropdown = driver.findElement(value);
		Select objselect = new Select(dropdown);
		objselect.selectByValue(value1);
	}

	public void dropdownbyvisibletext(By value, String value1) {
		WebElement dropdown = driver.findElement(value);
		Select objselect = new Select(dropdown);
		objselect.selectByVisibleText(value1);
	}

	public void dropdownbyindex(By value, int value1) {
		WebElement dropdown = driver.findElement(value);
		Select objselect = new Select(dropdown);
		objselect.selectByIndex(value1);
	}


	//public static void Dropdownfn(By element, String value1) {
		//WebElement test = driver.findElement(element);
		//Select objdrop1 = new Select(test);
		//objdrop1.selectByValue(value1);

	//}

	//public static void Dropdownfn(WebElement element, String value1) {
	//	Select objdrop1 = new Select(element);
	//	objdrop1.selectByValue(value1);

	//}
	
	public static void Screenshots() throws IOException {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("ddMMYYYY_HHmmss");
	     String	 data=sdf.format(d);
	     
		TakesScreenshot objscreen = (TakesScreenshot)driver;
		File out= objscreen.getScreenshotAs(OutputType.FILE);
		File expe = new File("D:\\Screenshot\\test" +data+"jpeg");
		FileUtils.copyFile(out, expe);
		
		
		

	}
	
		
		
		
	

	public void click(By value) {

		driver.findElement(value).click();

	}
	
	public void click(WebElement value) {

		value.click();

	}

	public void sendkeys(By value, String value1) {

		driver.findElement(value).sendKeys(value1);

	}

	
	public void sendkeys(WebElement value, String value1) {

		value.sendKeys(value1);

	}

	public String elementtext(By value) {

		return driver.findElement(value).getText();

	}
	
	public String elementtext(WebElement value) {

		return value.getText();
	

}
}
