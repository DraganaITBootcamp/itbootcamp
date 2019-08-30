package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopCollection {
	
static WebDriver driver;
	
	public TopCollection (WebDriver driver) {
		this.driver = driver;
	}
	
	//Elements
	
	private static List <WebElement> topColletions(){
		return driver.findElements(By.cssSelector("div.collection-title.C.C2"));
	}
	private static List <WebElement> nineLinks(){
		return driver.findElements(By.cssSelector("center.mt-big a"));
	}
	private static WebElement search() {
		return driver.findElement(By.cssSelector("input.form-control.input-sm.roundbox20.js-search-bar"));
	}
	private static WebElement invisibleBox() {
		return driver.findElement(By.cssSelector("div#search_options"));
	}
	private static WebElement goButton() {
		return driver.findElement(By.cssSelector("button.btn.btn-gray.label-primary.input-sm"));
	}
	private static WebElement advancedSearch() {
		return driver.findElement(By.cssSelector("div#search_options a"));
	}
	private static WebElement seeMore() {
		return driver.findElement(By.cssSelector("a.stealth"));
	}
	private static List <WebElement> topColletionsView(){
		return driver.findElements(By.cssSelector("div.num-items.topinblock"));
	}
	//Actions
	
	public List <WebElement> getTopColletions(){
		return topColletions();
	}
	public void clickElementOfColletions(Integer index) {
		topColletions().get(index).click();
	}
	public int sizeOfElements() {
		return topColletions().size();
	}
	public String textOfElements(Integer index) {
		return topColletions().get(index).getText();
	}
	public List <WebElement> getNineLinks(){
		return nineLinks() ;
	}
	public void clickNineLinks(Integer index) {
		nineLinks().get(index).click();
	}
	public void clikSearch() {
		search().click();
	}
	public void inputSearch(String text) {
		search().sendKeys(text);
	}
	public void clickGoButton() {
		goButton().click();
	}
	public void clickAdvancedSearch() {
		advancedSearch().click();
	}
	public void clickSeeMore() {
		seeMore().click();
	}
	public boolean isElementVisible(){
	    return driver.findElement(By.cssSelector("div#search_options")).isDisplayed();
    }	
	
	public List <WebElement> getTopColletionsView(){
		return topColletionsView();
	}
	public String textTopColletionsView(Integer index) {
		return topColletionsView().get(index).getText();
	}
	
	
}	


