package peti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPhp {
	
	WebDriver driver;

    private static final String SEARCH = "admin";

	@BeforeTest
	
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void TestPHP() throws Exception{
		
		driver.navigate().to(PageURLs.DEMO);
        new PhpHome(driver).clickElement(1);
        Thread.sleep(5000);
        Assert.assertTrue(new PhpHome(driver).getChildWindowUrl().toLowerCase().contains(SEARCH));
        Thread.sleep(5000);
        
        new LoginPage(driver).inputEmail("dragana989gmail.com"); //domaci
        new LoginPage(driver).inputPassword("123gaga123");
        new LoginPage(driver).clickChaechButton();
        new LoginPage(driver).clickButtonLogin();
        Thread.sleep(5000);
        // System.out.println(new LoginPage(driver).getErrorBlok());
        Assert.assertEquals(new LoginPage(driver).getErrorBlok(),"The Email field must contain a valid email address.");
}
}

