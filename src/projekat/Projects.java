package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Projects {

static WebDriver driver;
	
	public Projects (WebDriver driver) {
		this.driver=driver;
	}
	//Elements
	private static List <WebElement> projectsItemsImg(){
		return driver.findElements(By.cssSelector("div.col-sm-3"));//klikabilna slika
	}
	private static List <WebElement> projectsItemsText(){
		return driver.findElements(By.cssSelector("div.col-sm-9"));//tekst
	}
	
	//
	
	public List <WebElement> getProjectsItemsImg(){
		return projectsItemsImg();
	}
	public int numberItemsImg() {
		return projectsItemsImg().size();
	}
	public List <WebElement> getProjectsItemsText(){
		return projectsItemsText();
	}
	public int numberOfText() {
		return projectsItemsText().size();
	}
}
