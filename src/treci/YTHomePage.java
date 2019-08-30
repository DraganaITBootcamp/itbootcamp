package treci;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YTHomePage {
	
	static WebDriver driver;
	
	public YTHomePage (WebDriver driver) {
		this.driver = driver;
	}
    
	//Elements
	private static WebElement inputSearch() {
		return driver.findElement(By.cssSelector("input#search"));
	}
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("button#search-icon-legacy"));
}
	private static List<WebElement> listVideos (){
		return driver.findElements(By.cssSelector("div#dismissable"));
	}
	
	//Actions
	public void inputSearchText(String text) {
		inputSearch().sendKeys(text);
	}
	public void clickSearchButton() {
		searchButton().click();
	}
	public List<WebElement> getListVideos(){
		return listVideos();
	}
	public int numberOfElements() {
		return listVideos().size();
	}
}