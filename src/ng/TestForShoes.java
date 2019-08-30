package ng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TestForShoes {
 WebDriver driver;
 
 @BeforeTest
 public void setup() {
	 System.setProperty("webdriver.gecko.driver",
			 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.get("https://www.ebay.com");
 }
 @Test
 public void Test() {
	 Shoes shoes = new Shoes(driver);
	
	  shoes.sendKeysToSearch("shoes");
	  shoes.clickButton();
      Assert.assertTrue(shoes.numberOfElements() > 24);
 }
}
