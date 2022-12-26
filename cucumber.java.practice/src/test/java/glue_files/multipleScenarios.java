package glue_files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multipleScenarios {

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
	    System.out.println("this is 1st scn when");
	}

	@Then("user login should be successful")
	public void user_login_should_be_successful() {
		System.out.println("this is 1st scn then");
	}

	@Given("User is already logged into the gmail")
	public void user_is_already_logged_into_the_gmail() {
		System.out.println("this is 2nd scn given");
	}

	@When("search for the {} emails")
	public void search_for_the_emails(String string) {
	    System.out.println("this is 2nd scn when ");
	}

	@When("select the emails from flipkart")
	public void select_the_emails_from_flipkart() {
		System.out.println("this is 3rd scn when");
	}

	@Then("user should be able to select the emails")
	public void user_should_be_able_to_select_the_emails() {
		System.out.println("this is 3rd scn then");   
	}
	
}
