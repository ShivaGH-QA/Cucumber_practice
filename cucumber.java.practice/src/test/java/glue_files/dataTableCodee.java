package glue_files;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class dataTableCodee {
	
	@Given("user is already has data table list")
	public void user_is_already_has_data_table_list() {
	   System.out.println("given list steps");
	}
	
	@When("adding steps")
	public void adding_list_Steps(DataTable table) {
		 List<List<String>> list=table.asLists(String.class);
		    String name=list.get(0).toString();
		    System.out.println("name "+name);
		    for (List<String> e:list) {
		    	System.out.println("e value is "+e);
		    }
	}

	@Given("user is already has data table maps")
	public void user_is_already_has_data_table_maps() {
	  System.out.println("give maps steps");
			   }
	
	@When("adding maps steps")
	public void adding_maps_Steps(DataTable table) {
		 List<Map<String,String>> userMap=table.asMaps(String.class,String.class);
		 System.out.println(userMap.get(0).get("Name"));
	}

}
