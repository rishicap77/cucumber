package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.homepage;
import pageobjects.pageobjectmanager;
import utils.TestContextSetup;

public class homepagestep {
	public WebDriver driver;
	public String name;
	public pageobjectmanager pageobjectmanager;
	homepage hp;
	public  TestContextSetup testcontextsetup;
	 public homepagestep(TestContextSetup testcontextsetup) {
		 this.testcontextsetup=testcontextsetup;
		this.hp=	testcontextsetup.pageobjectmanager.gethomepageobject();
	 }
	@Given("user is on greenkart homepage")
	public void user_is_on_greenkart_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(hp.verifypagetitle().contains("GreenKart"));
	 
	  }
	
	@When("user searches the product with shortname {string} and increases the quantity {string}")
	public void user_searches_the_product_with_shortname_and_increases_the_quantity(String shortname,String quantity) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   hp.searchAction(shortname);
	  Thread.sleep(3000);
	   hp.increment(Integer.parseInt(quantity));
	   testcontextsetup.name=  hp.getName().split("-")[0].trim();
	}
	
	@When("adds the product to cart and goes to checkoutpage")
	public void adds_the_product_to_cart_and_goes_to_checkoutpage() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 hp.addtocartclk();
		   hp.cartviewclk();
		   hp.chechclk();
		   Thread.sleep(3000);
	}
	
	@When("^user searches the product with shortname (.+) corresponding fullname is displayed$")
	public void user_searches_the_product_with_shortname_corresponding_fullname_is_displayed(String shortname) {
	    // Write code here that turns the phrase above into concrete actions
	

		hp.searchAction(shortname);
		testcontextsetup.name=  hp.getName().split("-")[0].trim();
	   //System.out.println(name);
	   hp.dealclk();
	}
	
}
