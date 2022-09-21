package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class clickhelper {
	public void clickUsingJS(WebDriver driver, WebElement element) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}catch(Exception e) {
			throw new Exception("clickUsingJS (ClickActionHelper) : "+e.getMessage());
		}
	}
	public void click(WebElement value) {

		value.click();

	}
	/**
	 * method to perform right click
	 * @throws Exception 
	 */
	public void rightClick(WebDriver driver, WebElement element) throws Exception {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(element).contextClick().build().perform();
		}catch (Exception e) {
			throw new Exception("rightClick (ClickActionHelper) : "+e.getMessage());
		}
	}
	/**
	 * method to perform double click
	 * @throws Exception 
	 */
	public void doubleClick(WebDriver driver, WebElement element) throws Exception {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(element).contextClick().build().perform();
			}catch (Exception e) {
				throw new Exception("rightClick (ClickActionHelper) : "+e.getMessage());
			}
		}


}
