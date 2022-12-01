package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTabularFormStep {
	
	@Given("User is at form page")
	public void user_is_at_form_page() {
	   System.out.println("Step 1 : user is at the form filling location");
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
		
		
		List<List<String>> variable = dataTable.asLists(String.class);
		
		for(List str:variable)
		{
			System.out.println(str);
		}
	  
	}

}
