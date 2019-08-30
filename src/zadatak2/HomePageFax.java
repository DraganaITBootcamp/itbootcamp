package zadatak2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageFax {

	static WebDriver driver;
	
	public HomePageFax(WebDriver driver) {
		 this.driver = driver;
	}
	
	//Elements
	
	private static List <WebElement> listOfNews() {
		return driver.findElements(By.cssSelector("div#sppb-addon-1490170923647 a"));
	}
	private static WebElement logo() {
		return driver.findElement(By.cssSelector("div#sp-logo"));
	}
	private static List <WebElement> listOfSlider() {
		return driver.findElements(By.cssSelector("div.owl-controls div.owl-dot"));
}
	private static WebElement registration() {
		return driver.findElement(By.cssSelector("div#sppb-addon-1484214606903"));
	}
	private static WebElement competition() {
		return driver.findElement(By.cssSelector("div#sppb-addon-1490173561414"));
}
	//Action
	
	public List<WebElement> getListOfNews(){
		return listOfNews();
		}
	public void clickListOfNews() {
		listOfNews().get(3).click();
	}
	public void clickLogo() {
		logo().click();
	}
}