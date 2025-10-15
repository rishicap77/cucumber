package stepdefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageobjects.dealspage;
import pageobjects.pageobjectmanager;
import utils.TestContextSetup;

public class dealspagestep {
	public  String dealname;
	public pageobjectmanager pageobjectmanager;
	public  TestContextSetup testcontextsetup;
	 public dealspagestep(TestContextSetup testcontextsetup) {
		 this.testcontextsetup=testcontextsetup;
	 }
	@Then("^user searches with same shortname (.+) on dealspage full productname on deals should match fullname on homepage$")
	public void user_searches_with_same_shortname_on_dealspage_full_productname_on_deals_should_match_fullname_on_homepage(String shortname) {
	    // Write code here that turns the phrase above into concrete actions
		
	   testcontextsetup.genericutils.switchwindow();
	  
	  dealspage dp=testcontextsetup.pageobjectmanager.getdealspageobject();
	 dp.searchAction(shortname);
	  dealname= dp.getName();
	  System.out.println(dealname);
	 Assert.assertEquals(testcontextsetup.name, dealname);
	 
	}
	

}
