package glue_files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataTable {
	
	@Given("user is logged into the application")
	public void user_is_logged_into_the_application() {
	   System.out.println("test");
	}

	@When("user selexts below option as country and State")
	public void user_selexts_below_option_as_country_and_state(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("test");
	}

	@Then("user gets error.")
	public void user_gets_error() {
		System.out.println("test data table");
	}

}
