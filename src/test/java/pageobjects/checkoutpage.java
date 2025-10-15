package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutpage {
	 public WebDriver driver;
	 public checkoutpage(WebDriver driver) {
		 this.driver=driver;
	 }
	 By produuctnamechk =By.xpath("//table[@class='cartTable']//tbody//tr[1]//td[2]/p");
	 By chkbtn =By.xpath("//button[text()='Place Order']");
	 By chechkbox=By.cssSelector(".chkAgree");
	 By pacebtn=By.xpath("//button[text()='Proceed']");
	 public String getcheckproductname() {
		return driver.findElement(produuctnamechk).getText();
	 }
	 
	 public void chkclk() {
		 driver.findElement(chkbtn).click();
	 }
	 
	 public void checkclk() {
		 driver.findElement(chechkbox).click();
	 }
	 
	 public void placeclk() {
driver.findElement(pacebtn).click();
	 }
}
