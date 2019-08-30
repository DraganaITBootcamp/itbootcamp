package peti;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpHome {
	
	static WebDriver driver;
	
	public PhpHome (WebDriver driver) {
		this.driver = driver;
	}

	//Element
	
	private static List <WebElement> elemetBox(){
		return driver.findElements(By.cssSelector("div.wow.fadeInUp.col-md-12.animated"));
	} 
	private static List <WebElement> listElement(){
		return driver.findElements(By.cssSelector("div.col-md-6 div.row a"));
}
	//Actioon
	
	public List<WebElement>getListOfElement(){
		return listElement();
	}
	public void clickElement(Integer index) {
		listElement().get(index).click();
	}
	public String getChildWindowUrl() {
	       Set<String> window = driver.getWindowHandles();
	       Iterator iterator = window.iterator();
	       String currentWindowId = null;
	       String mainPage = driver.getWindowHandle();
	       while(iterator.hasNext()){
	           currentWindowId = iterator.next().toString();
	           
	            if (!currentWindowId.equals(mainPage)){
	               driver.switchTo().window(currentWindowId);
	           }
	       }
	       return driver.getCurrentUrl();
	   }
}