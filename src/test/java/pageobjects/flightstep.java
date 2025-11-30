package pageobjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class flightstep {
	public  TestContextSetup testContextSetup;
	public flightstep(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

	@Given("user is on flight screen")
	public void user_is_on_flight_screen() {
	    
	   
	}
	@When("user fills the details and submits")
	public void user_fills_the_details_and_submits() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("flights should be displayed")
	public void flights_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
