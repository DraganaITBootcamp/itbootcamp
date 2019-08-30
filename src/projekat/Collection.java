package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Collection {
static WebDriver driver;
	
	public Collection (WebDriver driver) {
		this.driver = driver;
	    }
	//Elements
	
	private static List <WebElement> listOfCollectionMeni(){
		return driver.findElements(By.cssSelector("a.ikind.stealth"));
	}
	private static List <WebElement> listOfItemsCollection(){ 
		return driver.findElements(By.cssSelector("div.item-ia.hov"));
	}
	private static List <WebElement> leftListsCollections(){
		return driver.findElements(By.cssSelector("div.fatable"));
	}
	private static List <WebElement> moreButtons(){
		return driver.findElements(By.cssSelector("span.iconochive-right-solid"));
	}
	private static WebElement searchThisCollection() {
		return driver.findElement(By.cssSelector("input.form-control.input-sm.searchlist"));
	}
	private static List <WebElement> listOfIcons(){
		return driver.findElements(By.cssSelector("a.stealth span.hidden-xs-span"));
	}
	private static WebElement viewResults() {
		return driver.findElement(By.cssSelector("div.results_count"));
	}
	
	
	//Actions 
	public List <WebElement> getListOfCollectionMeni(){
		return listOfCollectionMeni();
	}
	public void clickElementOfMeni(Integer index) {
		listOfCollectionMeni().get(index).click();
	}
	public List <WebElement> getItemsOfCollection(){
		return listOfItemsCollection();
	}
	public void clickItemsOfCollection(Integer index) {
		listOfItemsCollection().get(index).click();
	}
	public List <WebElement> getLeftListCollection(){
		return leftListsCollections();
	}
	public void clickLeftListCollection(Integer index) {
		leftListsCollections().get(index).click();
	}
	public List <WebElement> getMoreButtons(){
		return moreButtons() ;
	}
	public void clickMoreButton(Integer index) {
		moreButtons().get(index).click();
	}
	public void inputSearchThis(String text) {
		searchThisCollection().sendKeys(text);
	}
	public List <WebElement> getIcones(){
		return listOfIcons();
	}
	public void clickIcones(Integer index) {
		getIcones().get(index).click();
	}
	public String textViews() {
		return viewResults().getText();
	}
}
