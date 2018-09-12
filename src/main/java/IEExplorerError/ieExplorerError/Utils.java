package IEExplorerError.ieExplorerError;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends Basepage {
	
	public static void ClickOnElement (By by) {
		driver.findElement(by).click();
	}
	public static void EnterText (By by, String text) {
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(text);
	}
	public static String GetTextFromElement (By by) {
		return driver.findElement(by).getText();
	}
	public static void WaitForElementToPresence (By by, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	public static void javascriptexecutor (By by) {
		WebElement elements = driver.findElement(by);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", elements);
	}
}
