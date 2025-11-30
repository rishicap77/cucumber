package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class flighthomepage {

	public WebDriver driver;
	public flighthomepage(WebDriver driver) {
		this.driver=driver;
	}
	
	By originstation=By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT");
	By statenamesorigin=By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//li/a");
	By statenameorigin=By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//li/a");
	By dateselect=By.xpath("//a[@class='ui-state-default ui-state-active']");
	

}
