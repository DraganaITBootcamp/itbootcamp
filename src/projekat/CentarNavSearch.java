package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CentarNavSearch {
	
	static WebDriver driver;
	
	public CentarNavSearch(WebDriver driver) {
		this.driver = driver;
	    }
	
	//Elements
	
	public static List <WebElement> resultItem(){
		return driver.findElements(By.cssSelector("li.result-item"));
	}
	//Actions
	
	public List <WebElement> getResultItem(){
		return resultItem();
	}
    public void clicResultItem(Integer index) {
    	resultItem().get(index).click();
    }
}
