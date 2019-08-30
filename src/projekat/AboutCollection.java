package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutCollection {

	static WebDriver driver;
	
	public AboutCollection(WebDriver driver) {
		this.driver=driver;
	}
	//Elements
	
	private static WebElement aboutButton() {
		return driver.findElement(By.cssSelector("span.tabby-text"));
	}

	private static List <WebElement> listOfContributors(){
		return driver.findElements(By.cssSelector("div.items_list.person"));
	}
	private static List <WebElement> listOfGraph(){
		return driver.findElements(By.cssSelector("div.grafs.about-box"));
	}
	private static List <WebElement> relateCollections(){
		return driver.findElements(By.cssSelector("div.topinblock"));
	}
	private static List <WebElement> topRegions(){
		return driver.findElements(By.cssSelector("table.stats-table tr"));
	}
	//Actions
	
	public void clickAboutButton() {
		aboutButton().click();
	}
	public List <WebElement> getListOfContributors(){
		return listOfContributors();
	}
	public List <WebElement> getListOfGraph(){
		return listOfGraph();
	}
	public List <WebElement> getRelateCollections(){
		return relateCollections();
	}
	public List <WebElement> getTopRegions(){
		return topRegions();
	}
} 
