package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.pageobjectmanager;

public class TestContextSetup {
	public WebDriver driver;
	 public String name;
	 public pageobjectmanager pageobjectmanager;
	 public webdrivermanager webdrivermanager;
	 public genericutils genericutils;
	 public TestContextSetup() throws IOException {
		 webdrivermanager =new webdrivermanager();
		 pageobjectmanager=new pageobjectmanager(webdrivermanager.getdriver());
		 genericutils =new genericutils(webdrivermanager.getdriver());
		 
	 }
}
