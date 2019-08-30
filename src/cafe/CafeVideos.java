package cafe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CafeVideos {
	
	static WebDriver driver;
	
	public CafeVideos(WebDriver driver) {
		this.driver = driver;
	}
    //Elements 
	
	private static List<WebElement> videos(){
		return driver.findElements(By.cssSelector("div#index_videos_videos_items"));
	}
	
	//Actions
	
	public  List<WebElement> getVideos(){
		return videos();
	}
	public int numberOfVideos() {
		return videos().size();
	}
}
