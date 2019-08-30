package ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpotTest {
	
	WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://www.bet-at-home.com/");
	 }
	@Test
	public void Test() {
				
		 Sport sport = new Sport();
		
		sport.writeEmail("dragana987@gmail.com");
		sport.writePassword("123.Gaga123");
		sport.clickLogin();
		sport.clickRegister();
	}
}
