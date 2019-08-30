package testprojekat;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projekat.HomePage;
import projekat.PageURL;
import projekat.Upload;

public class TestUpload {
	
	     WebDriver driver;
		 
		 @BeforeTest
		 public void setup() {
			 System.setProperty("webdriver.gecko.driver",
					 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
	}
		 @Test
		 public void LogIn() throws Exception{
			 
			 driver.navigate().to(PageURL.HOME_PAGE);
			 new HomePage(driver).clickUpload();
             System.out.println(new Upload(driver).textLoginSingin());
             Assert.assertEquals(new Upload(driver).textLoginSingin(),"Log in or Sign up");
			
    }         
}

