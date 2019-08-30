package cafe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePages {
	
	static WebDriver driver;
	
	public HomePages(WebDriver driver) {
		this.driver = driver;
	}
    //Elements
	
	private static WebElement meniButton() {
		return driver.findElement(By.cssSelector("div#mc-header-menu-btn"));
	}
	private static WebElement logo() {
		return driver.findElement(By.cssSelector("a.mc-header-logo"));
}
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("input#search_keyword_top"));
}
	private static List <WebElement> filter(){
		return driver.findElements(By.cssSelector("div.mc-ma.mc-mt-menu a"));
	}

	private static List <WebElement> meniCategories(){
		return driver.findElements(By.cssSelector("div.mc-header-block-content a"));
}
	
	//Actions
	
	public void clickMeniButton() {
		meniButton().click();
	}
	public void clickLogo() {
		logo().click();
}
	public void inputSearchBox(String text) {
		searchBox().sendKeys(text);
}
	public List<WebElement> getFilter(){
		return filter();
	}
	public void clickElementFilter(Integer index) {
		filter().get(index).click();
	}
	public List<WebElement> getMeniCategories(){
		return meniCategories();
	}
	public void clickMeniCategories(Integer index) {
		meniCategories().get(index).click();
	}
}