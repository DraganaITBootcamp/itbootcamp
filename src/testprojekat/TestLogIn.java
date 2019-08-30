package testprojekat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import projekat.Base;
import projekat.HomePage;
import projekat.LogIn;
import projekat.PageURL;

public class TestLogIn {
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
		 
		 new HomePage(driver).clickSingIn();
		 Thread.sleep(6000);
		 Assert.assertTrue(new LogIn(driver).isElementVisible());
		 new LogIn(driver).inputEmail("foo@gmail.com");
		 new LogIn(driver).inputpassLogIn("bar");
		 new LogIn(driver).clickKeepLogIn();
		 new LogIn(driver).clickLogInButton();
		 Thread.sleep(4000);
		 System.out.println(new LogIn(driver).textErrorMessage());
		 Assert.assertEquals(new LogIn(driver).textErrorMessage(),"Email address and/or Password incorrect. Forgot password?");
		 
}
}