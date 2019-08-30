package prvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	public static final String searchTerm = "java";
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 @Test
	 public void youTubeTest() throws Exception{
		 
		 driver.navigate().to(PageURLs.YT_MAIN_PAGE);
		 new YouTubeHomePage(driver).sendTextToSearchBox(searchTerm);
		 new YouTubeHomePage(driver).clickOnSearchButton();
		 new YouTubeSearchResultsPage(driver).clickFilterButton();
		 new YouTubeSearchResultsPage(driver).clickFirstFilter();
		 //new YouTubeSearchResultsPage(driver).clickFirstElement();
		 String string = new YouTubeSearchResultsPage(driver).getFirstElementText();
		 System.out.println(string);
		 String string1 = new YouTubeSearchResultsPage(driver).getTitleOfFirstVideo();//domaci
		 System.out.println(string1);   //domaci                                              //domaci
		 Assert.assertTrue(string.toLowerCase().contains(searchTerm));  
		 Assert.assertTrue(string1.toLowerCase().contains(searchTerm)); //domaci 
	 }
	 
}