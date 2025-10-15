package pageobjects;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {
 public WebDriver driver;
 public homepage(WebDriver driver) {
	 this.driver=driver;
 }
	
	By searchProduct=By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By productName=By.xpath("//div[@class='product']//child::h4");
	By deallink=By.linkText("Top Deals");
	By increment=By.xpath("//div[@class='stepper-input']//child::a[2]");
	By addtocart=By.xpath("//button[text()='ADD TO CART']");
	By cartview=By.xpath("//img[@alt='Cart']");
	By chechnxt=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	public void searchAction(String product) {
		driver.findElement(searchProduct).sendKeys(product);
		
	}
	
	public String getName() {
		return driver.findElement(productName).getText();
	}
	
	public void dealclk() {
		driver.findElement(deallink).click();
	}
	
	public void increment(int quantity) {
		for(int i=quantity-1;i>0;i--) {
		driver.findElement(increment).click();
		}
	}
	
	public void addtocartclk() {
		driver.findElement(addtocart).click();
	}
	public void cartviewclk() {
		driver.findElement(cartview).click();
	}
	public void chechclk() {
		driver.findElement(chechnxt).click();
	}
	
	public String verifypagetitle() {
		return driver.getTitle();
	}
}
