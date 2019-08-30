package cetvrti;

import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


public class TestVideo {
	

		 WebDriver driver;
		 
		 @BeforeTest
		 public void setup() {
			 System.setProperty("webdriver.gecko.driver",
					 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
	}
		 
	  @Test
	  public void Test() throws Exception{
		  
		  driver.navigate().to(PageURL.MACHINE_LEARNING);
		  Thread.sleep(8000);
		  new HomePageMach(driver).clickMuchVideo();
		  Thread.sleep(8000);
		  new HomePageMach(driver).clickButtonVideo();
}
}