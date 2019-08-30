package zadatak2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFax1 {
	public static final String search = "zumtobel-group"; 
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 
  @Test
  public void Test() throws Exception{
	  
	  driver.navigate().to(PagesURLs.HOME_PAGE);
	  Thread.sleep(4000);
	  new HomePageFax(driver).clickListOfNews();
	  Thread.sleep(4000);
	  Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains(search));
	  new HomePageFax(driver).clickLogo();
	  
	  driver.navigate().to(PagesURLs.KATEDRE_PAGE);
	  Thread.sleep(4000);
	  //System.out.println(new PageKatedra(driver).numberOfElementList());
	  Assert.assertTrue(new PageKatedra(driver).numberOfElementList() == 10);
	  Thread.sleep(4000);
	  Actions builder = new Actions(driver);
	  builder.moveToElement(new PageKatedra(driver).firstNavigationList())
	  .build().perform();
	  new PageKatedra(driver).firstNavigationList().click();
	  driver.close();
  }
}