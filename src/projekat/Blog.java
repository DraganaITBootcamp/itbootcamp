package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Blog {
	
static WebDriver driver;
	
	public Blog (WebDriver driver) {
		this.driver=driver;
	}
	//Elements
	
	private static List <WebElement> blogNavMeni(){
		return driver.findElements(By.cssSelector("li.menu-item"));
	}
	private static List <WebElement> blogImg(){
		return driver.findElements(By.cssSelector("a.shareitem img"));
	}
	private static WebElement arhivesDopDown() {
		return driver.findElement(By.cssSelector("select#archives-dropdown-2"));//nema akcije
	}
	private static WebElement searchBlog() {
		return driver.findElement(By.cssSelector("input#s"));
	}
	private static WebElement searchButtonBlog() {
		return driver.findElement(By.cssSelector("input#searchsubmit"));
	}
	private static List <WebElement> dinamicList(){ //kada se u search izabere nesto
		return driver.findElements(By.cssSelector("h2.entry-title"));
	}
	

    //Actions
	
	public List <WebElement> getBlogMeni(){
		return blogNavMeni();
	}
	public void clickBlogMeni(Integer index) {
		blogNavMeni().get(index).click();
	}
	public List <WebElement> getBlogImg(){
		return blogImg();
	}
	public void clickBlogImg(Integer index) {
		blogNavMeni().get(index).click();
	}
	public void clickSearchBlog() {
		searchBlog().click();
	}
	public void inputSearchBlog(String text) {
		searchBlog().sendKeys(text);
}
	public void clickSearchButton() {
		searchButtonBlog().click();
	}
	public List <WebElement> getDinamicList(){ 
		return dinamicList();
	}
	public void dropdownArhives(String text) {
	      Select drp = new Select(arhivesDopDown());
	      drp.selectByVisibleText(text);
	  }
}