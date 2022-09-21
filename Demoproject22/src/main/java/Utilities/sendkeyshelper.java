package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sendkeyshelper {
	/**
	 * method to set text to the input field
	 * @throws Exception 
	 */
	public void sendKeys(WebDriver driver, WebElement element, String inputText) throws Exception {
		try {
			element.sendKeys(inputText);
		}catch(Exception e) {
			throw new Exception("sendKeys (SendKeysActionHelper) "+e.getMessage());
		}
	}
	/**
	 * method to clear and set text to the input field
	 * @throws Exception 
	 */
	public void clearTextAndSendKeys(WebDriver driver, WebElement element, String inputText) throws Exception {
		try {
			element.clear();
			element.click();
			element.sendKeys(inputText);
		}catch(Exception e) {
			throw new Exception("clearTextAndSendKeys (SendKeysActionHelper) "+e.getMessage());
		}
	}
	/**
	 * method to set text to input field using js
	 * @throws Exception 
	 */

}
