package cafe;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCafe {
	WebDriver driver;

    private static final String SEARCH = "trending";

	@BeforeTest
	
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void TestPHP() throws Exception{
		
		driver.navigate().to(HomeURLs.META_CAFE);
        Thread.sleep(4000);
		new HomePages(driver).clickMeniButton();
		Thread.sleep(4000);
		new HomePages(driver).clickMeniCategories(6);
		new HomePages(driver).clickLogo();
		Thread.sleep(4000);
		new HomePages(driver).clickElementFilter(2);
		Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains(SEARCH));
		Thread.sleep(4000);
		Assert.assertTrue(new CafeVideos(driver).numberOfVideos() <= 7);
		new HomePages(driver).clickLogo();
		
		new LoginPage(driver).clickLogin();
        Thread.sleep(4000);
        new LoginPage(driver).inputEmail("gaga123@gmail.com");
        new LoginPage(driver).inputPassword("aaa121aaa");
        Thread.sleep(4000);
        new LoginPage(driver).clickButtonLogin();
        System.out.println(new LoginPage(driver).textErrorMessage());
        Thread.sleep(4000);
        Assert.assertEquals(new LoginPage(driver).textErrorMessage(),"Invalid Login or Password. Login and Password are case-sensitive.");
}
}