package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class About {
	
	static WebDriver driver;
	
	public About (WebDriver driver) {
		this.driver=driver;
	}
	
	private static List <WebElement> newsList(){
		return driver.findElements(By.cssSelector("tr.forumRow"));
	}
	private static WebElement buttonMore() {
		return driver.findElement(By.linkText("[more]"));
	}
	
	//Actions
	
	public List <WebElement> getNewsList(){
		return newsList();
	}
	public int sizeOfNewsList() {
		return newsList().size();
	}
	public void clickMore() {
		 buttonMore().click();
	}

}
