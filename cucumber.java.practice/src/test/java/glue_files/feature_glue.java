package glue_files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class feature_glue {
	
	@Given("User is already registered to application")
	public void User_is_already_registered_to_application() {
	 System.out.println("this is Given steps");  
	}

	@Given("login with valid credentials")
	public void login_with_valid_credentials() {
	 System.out.println("this 2nd is Given steps- modified");  
	} 
	
	@When("User click on login")
	public void login() {
		System.out.println("this is when steps");
	   
	}

	@When("login shuld be successful")
	public void login_successful() {
	   System.out.println("this is 2nd step when condition");
	}

	@Then("After login landing page should be Welcom page")
	public void welcom_page() {
	    System.out.println("this is Then condition");
	}
	
	@Then("Welcome page with comapnay logo")
	public void welcom_page_login() {
	    System.out.println("this is welcome page login Then condition");
	}

}
