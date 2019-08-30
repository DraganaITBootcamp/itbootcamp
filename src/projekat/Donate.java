package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Donate {
    
	static WebDriver driver;
	
	public Donate(WebDriver driver) {
		this.driver=driver;
	}
	//Elements
	
	private static List <WebElement> buttonsDonate(){
		return driver.findElements(By.cssSelector("ul.donation-radio-list.donationlevel li"));
	}
	private static WebElement inputManey() {
		return driver.findElement(By.cssSelector("input#amount_custom"));
	}
    //Actions
	
	public List <WebElement> getButtonsDonate(){
		return buttonsDonate();
	}
	public void clickButtonDonate(Integer index) {
		buttonsDonate().get(index).click();
	}
	public void clickInputMoney() {
		inputManey().click();
	}
	public void writeMoney(String text) {
		inputManey().sendKeys(text);
	}
}
