package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

     public class AdvancedSearch {
	 static WebDriver driver;
		
		public AdvancedSearch(WebDriver driver) {
			this.driver=driver;
		}
		
		//Elements
		
		private static WebElement buttonAdvancedSearch() {
			return driver.findElement(By.cssSelector("a.search-options__advanced-search-link"));
		}
		private static List <WebElement> listOfAdvanced(){
			return driver.findElements(By.cssSelector("div.row div.col-sm-7"));
		}
		private static List <WebElement> buttonsSearch() {
			return driver.findElements(By.cssSelector("input.btn.btn-primary"));
		}
		private static WebElement query() {
			return driver.findElement(By.cssSelector("input.form-control.input-sm"));
		}
		private static WebElement fieldsToReturn() {
			return driver.findElement(By.name("fl[]")); //akcija nema
		}
		private static WebElement numberOfResults() {
			return driver.findElement(By.cssSelector("input#numresults")); 
		}
		private static WebElement pages() {
			return driver.findElement(By.cssSelector("input.form-control.input-sm.pull-right")); 
		}
		private static List <WebElement> listOfOutput(){
			return driver.findElements(By.name("output"));
		}
		private static List <WebElement> listOfOptional(){
			return driver.findElements(By.name("sort[]"));
		}
		
		
		
		//Actions
		
		public void clickAdvancedSearch() {
			buttonAdvancedSearch().click(); //iz skrivenog search-a
		}
		public List<WebElement> getListOfAdvanced(){
			return listOfAdvanced();
		}
		public List<WebElement> getBottonsSearch(){
			return buttonsSearch();
		}
		public void clickButtonsSearch(Integer index) {
			buttonsSearch().get(index).click();
		}
		public void inputQuery(String text) {
			query().sendKeys(text);
		}
		public void inputNumberOfResults(String text) {
			numberOfResults().sendKeys(text);
		}
		public void inputPages(String text) {
			pages().sendKeys(text);
		}
		public List<WebElement> getListOfOutput(){
			return listOfOutput();
		}
		public void clickListOfOutput(Integer index) {
			listOfOutput().get(index).click();
		}
		public List<WebElement> getListOfOptional(){
			return listOfOptional();
		}
		public void clickListOfOptional(Integer index) {
			listOfOptional().get(index).click();
		}
		
}
