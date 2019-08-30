package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Help {
	
    static WebDriver driver;
	
	public Help(WebDriver driver) {
		this.driver=driver;
	}
    //Elements
	
	private static WebElement serachHelp() {
		return driver.findElement(By.cssSelector("input#query"));
	}
	private static List<WebElement> buttonsHelp(){
		return driver.findElements(By.cssSelector("li.blocks-item"));
	}
	private static WebElement signInHelp() {
		return driver.findElement(By.cssSelector("a.login"));
	}
	 //Actions
	public void clickSearchHelp() {
		serachHelp().click();
	}
	public void inputSearchHelp(String text) {
		serachHelp().sendKeys(text + Keys.ENTER);
	}
	public List<WebElement> getButtonsHelp(){
		return buttonsHelp();
	}
	public void clickButtonsHelp(Integer index) {
		buttonsHelp().get(index).click();
	}
	public void clickSingInHelp() {
		signInHelp().click();
	}
	
	
}
