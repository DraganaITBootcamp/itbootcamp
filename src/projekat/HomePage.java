package projekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
 
static WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	    }
	//Elements
	
	private static List <WebElement> navMeni() { //navigaciona lista
		return driver.findElements(By.cssSelector("li.dropdown.dropdown-ia.pull-left"));
		}
	private static WebElement wayBeckImg() {  //slika u skrivenom meni-ju
		return driver.findElement(By.cssSelector("div.col-sm-6"));
	    }
	private static WebElement searchBox() {  //search u skrivenom meni-ju
		return driver.findElement(By.cssSelector("input#nav-wb-url"));
        }
	private static List <WebElement>widgets(){ // kruzne slike
		return driver.findElements(By.cssSelector("div.widgets"));
	}
	private static List <WebElement>featuredAndTop(){ //linkovi pored slika
		return driver.findElements(By.cssSelector("div.linx a"));
	}
	private static WebElement logo() {
		return driver.findElement(By.cssSelector("span.iconochive-logo"));
        }
	private static WebElement signIn() {
		return driver.findElement(By.cssSelector("a.nav-user"));
        }
	private static WebElement upload() {
		return driver.findElement(By.cssSelector("span.hidden-xs-span.hidden-sm-span"));
        }
	private static WebElement invisibleSearch() {
		return driver.findElement(By.cssSelector("input#search-bar-2"));
        }
	private static List <WebElement> pageLinks() { //about,contact,blog,help...
		return driver.findElements(By.cssSelector("ul#nav-abouts a"));
        }
	private static WebElement userMeni() {
		return driver.findElement(By.cssSelector("span.hidden-xs-span")); //ulogovani korisnik
	}
	
	//Actions
	
	
	public List<WebElement>getNavMeni(){
		return navMeni();
	}
	public void clickNavMeni(Integer index) { //klik za navigacioni meni
		navMeni().get(index).click();
	}
	public void clickWayBeck() {
		wayBeckImg().click();
	}
	public void clickSearchBox() { //klik search box
		searchBox().click();
	}
	public void inputSearchbox(String text) { //upis u searchbox
		searchBox().sendKeys(text + Keys.ENTER);
	}
	public void clickLogo() {
		logo().click();
	}
	public void clickSingIn() {
		signIn().click();
	}
	public void clickUpload() {
		upload().click();
	}
	public void clickInvisibleSearch() {  //skriveni search
		invisibleSearch().click();
	}
	public void inputInvisibleSearch(String text) { //upis u skriveni searchbox
		invisibleSearch().sendKeys(text + Keys.ENTER);
	}
	public List<WebElement>getWidgets(){   //dve slike u skrivenom meniju
		return widgets();
	}
	public void clickWidgets(Integer index) {  //klik na sliku
		widgets().get(index).click();
	}
	public List<WebElement>getFeaturedAndTop(){   // linkovi pored slika u skrivenom meniju
		return featuredAndTop();
	}
	public void clickFeaturedAndTop(Integer index) {  //klik na link u skrivenom meniju
		featuredAndTop().get(index).click();
	}
	public void clickUserMeni() {  //ikonica za ulogovanog korisnika
		userMeni().click();
	}
	
	/*public List<WebElement>getPagesLinks(){  
		return pageLinks();
	}
	public void clickPageLinks(Integer index) {
		pageLinks().get(index).click(); 
	}*/
}
