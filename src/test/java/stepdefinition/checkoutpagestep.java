package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageobjects.checkoutpage;
import pageobjects.pageobjectmanager;
import utils.TestContextSetup;

public class checkoutpagestep {

	public pageobjectmanager pageobjectmanager;
	public  TestContextSetup testcontextsetup;
	public checkoutpage checkoutpage;;
	 public checkoutpagestep(TestContextSetup testcontextsetup) {
		 this.testcontextsetup=testcontextsetup;
		this.checkoutpage= testcontextsetup.pageobjectmanager.getcheckpageobject();
	 }
	
	
	@Then("checks that productname is matching with productadded")
	public void checks_that_productname_is_matching_with_productadded() {
	    // Write code here that turns the phrase above into concrete actions
	  
	 String chename= checkoutpage.getcheckproductname().split("-")[0].trim();
	 System.out.println(chename);
	 checkoutpage.chkclk();
	 Assert.assertEquals(testcontextsetup.name, chename);
	}
	@Then("places the order by filling all the fields")
	public void places_the_order_by_filling_all_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	  testcontextsetup.genericutils.dropdown("Algeria");
	checkoutpage.checkclk();
	  checkoutpage.placeclk();
	}
	
}
