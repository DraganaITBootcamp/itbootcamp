package zadatak2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageKatedra {
	

		static WebDriver driver;
		
		public PageKatedra(WebDriver driver) {
			 this.driver = driver;
		}
		
		//Elements
	    private static List<WebElement> navigationList() {
			return driver.findElements(By.cssSelector("ul.sp-megamenu-parent li.sp-menu-item"));
		}
	    private static List<WebElement> elementList() {
			return driver.findElements(By.cssSelector("div.clearfix div.sppb-addon.sppb-addon-feature.sppb-text-center.major-color"));
		}
	   
	    //Actions
	    
	    public List<WebElement>getNavigationList(){
	    	return  navigationList();
	    }
	    public  List<WebElement> getElementList(){
	    	return elementList();
	}
	    public int numberOfElementList() {
	    	return elementList().size();
	    }
	    public WebElement firstNavigationList() {
	    	return navigationList().get(0);
	    }
}

