package projekat;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingIn {
	
static WebDriver driver;
	
	public SingIn(WebDriver driver) {
		this.driver = driver;
	}
	//Elements
	
	private static WebElement singIn() {
		return driver.findElement(By.linkText("Sign up for free!"));
    }
	private static WebElement termsOfService() {
		return driver.findElement(By.linkText("Terms of Service"));
    }
	//Actions
	
	public void clickSingIn() {
		singIn().click();
	}
	public void clickTermsOfService() {
		termsOfService().click();
	}
	public String getChildWindow() {
	   Set<String> window = driver.getWindowHandles();
	   Iterator iterator = window.iterator();
	   String currentWindowId = null;
	   String mainPage = driver.getWindowHandle();
	   while(iterator.hasNext()){
	       currentWindowId = iterator.next().toString();
	       // Takes the url from child window
	       if (!currentWindowId.equals(mainPage)){
	           driver.switchTo().window(currentWindowId);
	       }
	   }
	   return driver.getCurrentUrl();
	    }

}
