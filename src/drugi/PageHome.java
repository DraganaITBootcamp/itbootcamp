package drugi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PageHome {

	static WebDriver driver;
	
	public PageHome( WebDriver driver ) {
		this.driver = driver;
	}
	//Elements
	private static WebElement inputBox() {
	    return	driver.findElement(By.cssSelector("input#q"));
	}
	private static WebElement inputTown() {
	    return	driver.findElement(By.cssSelector("span#select2-chosen-1"));
	}
    private static List<WebElement> searchTown(){//Lista gradova
		return driver.findElements(By.cssSelector("li.select2-results-dept-0.select2-result.select2-result-selectable"));
	}
    private static WebElement placeOfWork() {
	    return	driver.findElement(By.cssSelector("div.ms-parent uk-width-1-1.uk-form-large.uk-form-icon.uk-form-icon-flip.sfilter"));
    }
    private static List<WebElement> workingPlace(){//Lista oblasti rada
		return driver.findElements(By.cssSelector("div.ms-drop.bottom li label input"));
	}
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("button#__search_button"));
	}
	
	//Action
	public void inputKeyToBox(String text) {
	     inputBox().sendKeys(text);
	}
	public void clickOnTownBox() {
		inputTown().click();
	}
    public List<WebElement> getWorkingTown(){
		return searchTown();
	}
	public void clickWorkingTown() {
		searchTown().get(7).click();
	}
	
	
	public void clickOnWorkPlace() {
		placeOfWork().click();
	}
	
	public List<WebElement> getSearchPlace(){
		return workingPlace();
	}
	public void clickTown() {
		workingPlace().get(8).click();
	}
	
    public void clickSearchButton() {
		searchButton().click();
	}
}
