package testprojekat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projekat.HomePage;
import projekat.PageURL;
import projekat.TopCollection;

public class TestText {
	
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
		 new HomePage(driver).clickNavMeni(1);
		 new HomePage(driver).clickFeaturedAndTop(0);
		 String url1 = driver.getCurrentUrl();
		 new HomePage(driver).clickLogo();
		 new TopCollection(driver).clickNineLinks(1);
		 String url2 = driver.getCurrentUrl();
		 Assert.assertEquals(url1, url2);
}
}