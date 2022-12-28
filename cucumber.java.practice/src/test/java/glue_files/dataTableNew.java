package glue_files;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class dataTableNew {
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	   
	}

	@When("User enters following user details with columns")
	public void user_enters_following_user_details(DataTable dataTable) {
	    List<Map<String, String>> userMap=dataTable.asMaps(String.class,String.class);
	    System.out.println("printing "+userMap);
	    //System.out.println("size "+userMap.size());
	    //System.out.println("printing "+userMap.get(userMap.size()-1).get("Fname"));
	    

	    for(Map<String, String> e : userMap) {

	    System.out.println(e.get("Fname"));
	    System.out.println(e.get("Lname"));
	    }
	}

	@Then("user registration should be successfull")
	public void user_registration_should_be_successfull() {
	   
	}

}
