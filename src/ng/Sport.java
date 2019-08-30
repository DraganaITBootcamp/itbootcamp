package ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sport {
	 
	static WebDriver driver;
	 
	
	//elements
	 private static WebElement clickSport() {
		 return driver.findElement(By.cssSelector("li#navSport.nav-main-item a"));
	 }
	 private static WebElement inputSearchBox() {
		 return driver.findElement(By.cssSelector("div.input-text-wrapper.h-icon input#tbSearch"));
	 } 
	 private static WebElement betSlip () {
		 return driver.findElement(By.cssSelector("span.tab-tab-header a"));
	 }
	 private static WebElement bonusBox () {
		 return driver.findElement(By.cssSelector("strong.pro__title.h-pragmaticaBoldOblique"));
	 }
	 private static WebElement inputEmail () {
		 return driver.findElement(By.cssSelector("input#loginId"));
     }
	 private static WebElement inputPassword () {
		 return driver.findElement(By.cssSelector("div.input-text-wrapper input#loginPassword"));
     }
	 private static WebElement loginButton () {
		 return driver.findElement(By.cssSelector("a#btnLogin"));
	 }
	 private static WebElement registerButton () {
		 return driver.findElement(By.cssSelector("li.lil-item uib-data-register a"));
	 }
	
	 // actions 
	 public void writeEmail(String text) {
		 inputEmail().sendKeys(text);
	 }
	 public void writePassword(String text) {
		 inputPassword().sendKeys(text);
	 }	
	 public void clickLogin() {
		 loginButton().click();
	 }	
	 public void clickRegister() {
		 registerButton().click();
	 }		 
}