package peti;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	static WebDriver driver;
	
	public  LoginPage(WebDriver driver) {
        this.driver = driver;
	}
    
	//elements

	private static List<WebElement> emailAndPassword(){
		return driver.findElements(By.cssSelector("input.form-control"));
	}
	private static WebElement chechBox() {
		return driver.findElement(By.cssSelector("div.icheckbox_square-grey"));
}
	private static WebElement forgetPassword() {
		return driver.findElement(By.cssSelector("div.forget-password"));
}
	private static WebElement buttonLogin() {
		return driver.findElement(By.cssSelector("span.ladda-label"));
}
	private static WebElement errorBlok(){
		return driver.findElement(By.cssSelector("div.alert.alert-danger.loading.wow.fadeIn.animated.animated")); //domaci
	}
	
	//actions
	
	public List<WebElement> getEmailAndPassword() {
		return emailAndPassword();
	}
	public void inputEmail(String text){
		emailAndPassword().get(0).sendKeys(text);
	}
	public void inputPassword(String text){
		emailAndPassword().get(1).sendKeys(text);
    }
	public void clickChaechButton() {
		chechBox().click();
	}
	public void clickButtonLogin() {
		buttonLogin().click();
	}
	public String getErrorBlok() {
		return errorBlok().getText(); //domaci
	}
}