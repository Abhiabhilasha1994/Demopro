package Utilities;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitconditions {
	public static  WebDriver driver;
	//implementation of implicit waits
		public static void implicitwait(long time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
		

		//implementation of explicit waits using elementtobe clickable
		public void explicitwait(WebElement element,long seconds ) {
			WebDriverWait wait = new WebDriverWait(driver,seconds );
			wait.until(ExpectedConditions.elementToBeClickable( element));
		}
		
		//implementation of explicit waits using presenceofelement located
				public void explicitwait1(By element,long seconds ) {
					WebDriverWait wait = new WebDriverWait(driver,seconds );
					wait.until(ExpectedConditions.presenceOfElementLocated( element));
				}
				
				public void explicitwaitvisibility(WebElement element,long seconds ) {
					WebDriverWait wait = new WebDriverWait(driver,seconds );
					wait.until(ExpectedConditions.visibilityOf(element));
				}
				
				public void waitin() throws InterruptedException {
					Thread.sleep(3000);
				}
		//implementation of Fluent wait
				
				public void Fluentwait( long timeout ) {
					FluentWait wait=new FluentWait(driver);
					wait.until(ExpectedConditions.alertIsPresent());
					wait.ignoring(NoSuchElementException.class);
				}
}
				
				

