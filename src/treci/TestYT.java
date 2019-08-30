package treci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestYT {
	
	public static final String search_query = "qa"; 
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 
    @Test
    public void Test() throws Exception{
    	
    	driver.navigate().to(PageUrl.YT_HOME);
    	new YTHomePage(driver).inputSearchText("qa");
    	new YTHomePage(driver).clickSearchButton();
    	Assert.assertTrue(new YTHomePage(driver).numberOfElements() >= 5 );
    	Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains(search_query)); 
}
}