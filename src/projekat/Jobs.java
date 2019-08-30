package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jobs {

	static WebDriver driver;
	
	public Jobs(WebDriver driver) {
		this.driver=driver;
	}
	//Elements
	
	private static WebElement searchJobs(){
		return driver.findElement(By.cssSelector("input#q"));
	}
	private static WebElement buttonJobs(){
		return driver.findElement(By.cssSelector("a#btn_search_jobs"));
	}
	private static WebElement advancedJobs(){
		return driver.findElement(By.cssSelector("a#link_show_advanced_search"));
	}
	private static List <WebElement> listJobs(){
		return driver.findElements(By.cssSelector("a.job_title_link"));
	}
	//Actions
	
	public void clickSearchJobs() {
		searchJobs().click();
	}
	public void inputSearchJobs(String text) {
		searchJobs().sendKeys(text);
	}
	public void clickButtonJobs() {
		 buttonJobs().click();
	}
	public void clickAdvancedJobs() {
		advancedJobs().click();
	}
	public List <WebElement> getListJobs(){
		return listJobs();
	}
	public int numberOfListJobs() {
		return listJobs().size();
	}
}
