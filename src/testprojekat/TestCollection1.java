package testprojekat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projekat.Collection;
import projekat.PageURL;
import projekat.TopCollection;

public class TestCollection1 {
	
	  
		WebDriver driver;
		 
		 @BeforeTest
		 public void setup() {
			 System.setProperty("webdriver.gecko.driver",
					 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
	}
		 @Test
		 public void TopCollections1() throws Exception{
			 
		 driver.navigate().to(PageURL.HOME_PAGE);
		 new TopCollection(driver).textTopColletionsView(1);
		 
		 String num1 =new TopCollection(driver).textTopColletionsView(1).substring(0,7);
		 String newNum1 = num1.replace(",", "");
		 int result1 = Integer.valueOf(newNum1);
		 System.out.println(result1);
		 
		 new TopCollection(driver).clickElementOfColletions(1);
		 new Collection(driver).textViews();
		 
		 String num2 = new Collection(driver).textViews().substring(0,7);
		 String newNum2 = num2.replace(",", "");
		 int result2 = Integer.valueOf(newNum2);
		 System.out.println(result2);
		
		 Assert.assertTrue(result2 - result1 < 100);
		 }
}
