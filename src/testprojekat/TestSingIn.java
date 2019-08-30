package testprojekat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projekat.HomePage;
import projekat.LogIn;
import projekat.PageURL;
import projekat.SingIn;

public class TestSingIn {
	
	private static String TERM = "terms";
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 @Test
	 public void Sing() throws Exception{
		 
		 driver.navigate().to(PageURL.HOME_PAGE);
		 new HomePage(driver).clickSingIn();
		 Assert.assertTrue(new LogIn(driver).isForgotVisible());
         new SingIn(driver).clickSingIn();
         new SingIn(driver).clickTermsOfService();
         Thread.sleep(4000);
         Assert.assertTrue(new SingIn(driver).getChildWindow().toLowerCase().contains(TERM));
}
}