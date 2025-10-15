package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class genericutils {
public WebDriver driver;

public genericutils(WebDriver driver) {
	this.driver=driver;
}

public void switchwindow() {
	 Set<String> windows= driver.getWindowHandles();
	   Iterator<String> it=windows.iterator();
	  String parentid=it.next();
	  String childid=it.next();
	 driver.switchTo().window(childid);
}

public void dropdown(String option) {
	Select s=new Select(driver.findElement(By.xpath("//div/select")));
	s.selectByVisibleText(option);
}

}
