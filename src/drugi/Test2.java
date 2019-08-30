package drugi;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
	
	
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 
     @Test
     public void TestIS() throws Exception{
    	 
    	 driver.navigate().to(PageURL.poslovi_is);
    	 new PageHome(driver).inputKeyToBox("QA");
    	 new PageHome(driver).clickOnTownBox();
    	 new PageHome(driver).clickTown();
    	 new PageHome(driver).clickOnWorkPlace();
    	 new PageHome(driver).clickWorkingTown();
    	 new PageHome(driver).clickSearchButton();
    	 
}
     
     
}