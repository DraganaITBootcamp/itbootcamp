package projekat;


import java.io.FileOutputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class People {

	static WebDriver driver;
	
	public  People(WebDriver driver) {
		this.driver=driver;
		
	}
	//Elements
	
	private static List <WebElement> listPeople(){
		return driver.findElements(By.cssSelector("div.bio div"));
	}
	private static List <WebElement> nameOfPeople(){
			return driver.findElements(By.tagName("b"));
		}
	private static List <WebElement> jobsOfPeople(){
		return driver.findElements(By.tagName("i"));
	}
	
		//Actions
	
	public  List <WebElement> getListPeople(){
		return  listPeople();
	}
	public String textPeople(Integer index) {
		return listPeople().get(index).getText();
	}
	public  List <WebElement> getNamePeople(){
		return nameOfPeople() ;
	}
	public String namePeople(Integer index) {
		return  nameOfPeople().get(index).getText();
	}
	
	public String jobsOfPeople(Integer index) {
		return  jobsOfPeople().get(index).getText();
	}
}
	