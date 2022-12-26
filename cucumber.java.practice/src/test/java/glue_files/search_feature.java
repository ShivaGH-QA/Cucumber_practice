package glue_files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_feature {
	
	@Given("User is logged in successfully to application")
	public void user_is_logged_in_successfully_to_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is my 1st step");
	}

	@When("search for {string} in search field")
	public void search_for_in_search_field(String Purifier) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("this is step2");
	}

	@When("price range as {int}")
	public void price_range_as(Integer Price) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is step3");
	}

	@Then("search result should be listed")
	public void search_result_should_be_listed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is step4");
	}

	@Then("user selects an item for purchase")
	public void user_selects_an_item_for_purchase() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is step5");
	}

	@Then("user pays amount {int}")
	public void user_pays_amount(Integer Price) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is step6");
	}

}
