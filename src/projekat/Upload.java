package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Upload {

	 static WebDriver driver;
		
		public Upload(WebDriver driver) {
			this.driver=driver;
		}
		
		//Elements
		
		public static WebElement uploadFiles() {
			return driver.findElement(By.cssSelector("a.buttonG.btn.btn-success"));
		}
		public static WebElement buttonQuvestion() {
			return driver.findElement(By.cssSelector("span.iconochive-question-dark"));
		}
		public static WebElement buttonUploader() {
			return driver.findElement(By.cssSelector("a.btn.btn-primary"));
		}
		public static WebElement loginSingin(){
			return driver.findElement(By.xpath("/html/body/div/main/div/p/b[2]"));
		}
		
		//Action
		
		public void clickUploadFiles() {
			uploadFiles().click();
		}
		public void clickQuvestion() {
			 buttonQuvestion().click();
		}
		public void clickUploder() {
			buttonUploader().click();
		}
		public String  textLoginSingin(){
		return	loginSingin().getText();
		}
}