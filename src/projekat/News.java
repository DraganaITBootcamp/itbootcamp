package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class News {
 
	static WebDriver driver;
	
	public News (WebDriver driver) {
		this.driver=driver;
	}
	
	//Elements

	private static WebElement mailIcon() {
		return driver.findElement(By.cssSelector("span.iconochive-email"));
	}
	private static List <WebElement> listSubject(){
		return driver.findElements(By.cssSelector("tr.eve.forumRow a"));
	}
	//Actions
	
	public void clickMailIcon() {
		mailIcon().click();
	}
	public List <WebElement> getListSubject(){
		return listSubject();
	}
	public void clickListSubject(Integer index) {
		listSubject().get(index).click();
	}
}
