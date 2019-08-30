package projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	
static WebDriver driver;
	
	public LogIn(WebDriver driver) {
		this.driver = driver;
	}
	//Elements

	private static WebElement emailLogIn() {
		return driver.findElement(By.cssSelector("input.form-element.input-email"));
	}
	private static WebElement passLogIn() {
		return driver.findElement(By.cssSelector("input.form-element.input-password"));
    }
	private static WebElement resetPass() {
		return driver.findElement(By.cssSelector("span.reset-password"));
    }
	private static WebElement keepLogin() {
		return driver.findElement(By.cssSelector("label.regular"));
    }
	private static WebElement loginButton() {
		return driver.findElement(By.cssSelector("input.btn.btn-primary.btn-submit.input-submit"));
    }
	private static WebElement errorMessege() {
		return driver.findElement(By.cssSelector("span.login-error.password-error"));
    }
	
	
	//Actions
	
	public void inputEmail(String text) {
		emailLogIn().sendKeys(text);
	}
	public void  inputpassLogIn(String text) {
		passLogIn().sendKeys(text);
	}
	public void clickResetPass() {
		resetPass().click();
	}
	public boolean isForgotVisible(){
	    return driver.findElement(By.cssSelector("span.reset-password")).isDisplayed();
    }	
	public void clickKeepLogIn() {
		keepLogin().click();
	}
	public void clickLogInButton() {
		loginButton().click();
	}
	public boolean isElementVisible(){
	    return driver.findElement(By.linkText("Sign up for free!")).isDisplayed();
    }	
	public String textErrorMessage() {
		return errorMessege().getText();
	}
	
}