package cetvrti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageMach {
	
static WebDriver driver;
	
	public HomePageMach(WebDriver driver) {
		 this.driver = driver;
	}
    //Elements
	
	private static WebElement machVideo() {
		return driver.findElement(By.cssSelector("div.play-button.styles--play-button--akRnc"));
	}
	private static WebElement buttonVideo() {
		return driver.findElement(By.cssSelector("div.w100p.h100p.video-player--container--YDQRW"));
}
	//Action
	
	
	public void clickMuchVideo() {
		machVideo().click();
	}
	public void clickButtonVideo() {
		buttonVideo().click();
}
}