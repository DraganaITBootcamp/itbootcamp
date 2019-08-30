package testprojekat;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import projekat.Base;
import projekat.PageURL;
import projekat.People;
import projekat.TopCollection;

public class TestPeople extends Base {
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 @Test
	 public void People() throws Exception{
		 
		 driver.navigate().to(PageURL.PEOPLE);
		 Thread.sleep(6000);
		 new People(driver).namePeople(2);
		 new People(driver).jobsOfPeople(2);
         System.out.println( new People(driver).namePeople(2)+" "+new People(driver).jobsOfPeople(2));
	 
	     WebElement lista = driver.findElement(By.cssSelector("div.col-md-9"));
	     List<WebElement> names = lista.findElements(By.tagName("b"));
         Iterator<WebElement> i = names.iterator();
         while(i.hasNext()) {
        	 WebElement name = i.next();{
        	 System.out.println(name.getText());
         }
         }
         WebElement lista1 = driver.findElement(By.cssSelector("div.col-md-9"));
	     List<WebElement> jobs = lista1.findElements(By.tagName("i"));
         Iterator<WebElement> i1 = jobs.iterator();
         while(i.hasNext()) {
        	 WebElement job = i1.next();
        	 System.out.println(job.getText());
         }
         
         }
}

