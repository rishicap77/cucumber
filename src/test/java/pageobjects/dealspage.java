package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dealspage {
 public WebDriver driver;
 public dealspage(WebDriver driver) {
	 this.driver=driver;
 }
	
	By searchProduct=By.xpath("//input[@id='search-field']");
	By productName=By.xpath("//table[@class='table table-bordered']//tr/td[1]");
	
	
	public void searchAction(String product) {
		driver.findElement(searchProduct).sendKeys(product);
		
	}
	
	public String getName() {
		return driver.findElement(productName).getText();
	}
	
	
}
