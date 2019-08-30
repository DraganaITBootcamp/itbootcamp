package cafe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//Elements
	private static WebElement login() {
		return driver.findElement(By.cssSelector("a#login"));
	}
	private static WebElement email() {
		return driver.findElement(By.cssSelector("input#login_email"));
}
	private static WebElement password() {
		return driver.findElement(By.cssSelector("input#login_pass"));
}
	private static WebElement buttonLogin() {
		return driver.findElement(By.cssSelector("button.submit.mc-btn-big.mc-btn-login"));
	}	
		private static WebElement errorMessage() {
			return driver.findElement(By.cssSelector("div.mc-popup-main-error.generic-error"));	
}
	//Actions
	
	public void clickLogin() {
		login().click();
	}
	public void inputEmail(String text) {
		email().sendKeys(text);
	}
	public void inputPassword(String text) {
		password().sendKeys(text);
}
	public void clickButtonLogin() {
		buttonLogin().click();
}
	public String textErrorMessage() {
	return	errorMessage().getText();
	}
}


