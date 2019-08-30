package projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Subject {
	
    static WebDriver driver;
	
	public Subject (WebDriver driver) {
		this.driver=driver;
	}
	//Elements
	public static WebElement editButton() {
		return driver.findElement(By.linkText("edit"));
	}
	public static WebElement replyButton() {
		return driver.findElement(By.linkText("Reply to this post"));
	}
	public static WebElement goBeckButton() {
		return driver.findElement(By.linkText("Go Back"));
	}
	public static WebElement newsButton() {
		return driver.findElement(By.linkText("news"));
	}
	public static WebElement textButton() {
		return driver.findElement(By.linkText("text."));
	}
	//Actions
	public void clickEdit() {
		editButton().click();
	}
	public void clickReply() {
		replyButton().click();
	}
	public void clickGoBeck() {
		goBeckButton().click();
	}
	public void clickNews() {
		newsButton().click();
	}
	public void clickText() {
		textButton().click();
	}
}
