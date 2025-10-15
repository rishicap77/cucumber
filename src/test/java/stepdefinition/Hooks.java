package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	public TestContextSetup testContextSetup;
public Hooks(TestContextSetup testContextSetup) {
	this.testContextSetup=testContextSetup;
}
	@After
	public void closebrowser() {
		testContextSetup.webdrivermanager.driver.quit();
	}
	
	@AfterStep
	public void screenshot(Scenario scenario) throws IOException {
		WebDriver driver=testContextSetup.webdrivermanager.getdriver();
		if(scenario.isFailed()) {
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] dest=FileUtils.readFileToByteArray(source);
			scenario.attach(dest, "image/png", "image");
		}
	}
}
