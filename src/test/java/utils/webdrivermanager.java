package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdrivermanager {
public WebDriver driver;



public WebDriver getdriver() throws IOException {
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
	Properties properties=new Properties();
	properties.load(fis);
	String url=properties.getProperty("url");
	String browsername=properties.getProperty("browser");
	String browsersystem=System.getProperty("browser");
	
	if(driver==null) {
		if(browsername.equalsIgnoreCase("chrome")) {
	driver=new ChromeDriver();
	
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get(url);
	}
	return driver;
}


}
