package testprojekat;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import projekat.PageURL;
import projekat.TopCollection;

public class TestTopCollections {
    
	private static String TEXT = "ITEMS";
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 @Test
	 public void TopCollections() throws Exception{
		 
		 driver.navigate().to(PageURL.HOME_PAGE);
		 new TopCollection(driver).sizeOfElements();
		 System.out.println(new TopCollection(driver).sizeOfElements());
		 Assert.assertTrue(new TopCollection(driver).sizeOfElements() > 20);
		
		 WebElement lista = driver.findElement(By.cssSelector("div.collection-title.C.C2"));
	     List<WebElement> items = lista.findElements(By.name("ITEMS"));
         Iterator<WebElement> i = items.iterator();
         while(i.hasNext()) {
        	 WebElement item = i.next();
        	 System.out.println(item.getText());
         
        Assert.assertEquals(item.getText().contains(TEXT),true);
         }	
        
    }
	
}

      

      