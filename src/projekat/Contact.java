package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {
	
static WebDriver driver;
	
	public Contact (WebDriver driver) {
		this.driver=driver;
	}
	//Elements
   private static List<WebElement> maps(){
	return driver.findElements(By.cssSelector("div.col-md-9 img"));
   }
   //Actions
   
   public List<WebElement> getMaps(){
	   return maps();
   }
   public void clickMaps(Integer index) {
	   maps().get(index).click();
   }
}
