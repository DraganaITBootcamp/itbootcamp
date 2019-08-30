package ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shoes {

	static WebDriver driver;
	
	public Shoes(WebDriver driver) {
		this.driver = driver;
	
	//Elements	
	}
	private static WebElement searchInput() {
		return driver.findElement(By.cssSelector("#gh-ac"));
	}
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("#gh-btn"));
	}
	private static List <WebElement> list(){
	return  driver.findElements(By.className("s-item"));	
	}
	//Actions
	public void sendKeysToSearch(String text) {
		searchInput().sendKeys(text);
	}
	public void clickButton () {
		searchButton().click();
	}
	public int numberOfElements() {
	return list().size();
		
}
	}

