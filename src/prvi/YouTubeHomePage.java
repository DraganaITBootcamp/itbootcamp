package prvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubeHomePage {
 
	static WebDriver driver;
	
	public YouTubeHomePage ( WebDriver driver) {
		this.driver = driver;
	}
	//Elelements
	
	private static WebElement searchBox() {
	return driver.findElement(By.cssSelector("div#search-input input#search"));
	}
	private static WebElement searchButton() {
	return driver.findElement(By.cssSelector("button#search-icon-legacy"));
	}
	//Actions
	
	public void sendTextToSearchBox(String searchTerm) {
		searchBox().sendKeys(searchTerm);
	}
	public void clickOnSearchButton() {
		searchButton().click();
	}
}
