package testprojekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projekat.PageURL;
import projekat.TopCollection;

public class TestCentarSearch {
	
	private static String TEXT = "qa";
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 @Test
	 public void TopCentarSearch() throws Exception{
		 
		 driver.navigate().to(PageURL.HOME_PAGE);
		 new TopCollection(driver).clikSearch();
		 Assert.assertTrue(new TopCollection(driver).isElementVisible());
         new TopCollection(driver).inputSearch("qa");
         new TopCollection(driver).clickGoButton();
         Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains(TEXT));
        
         driver.close();
}
	
	}
