package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	@Given("User is at the profile view page")
	public void user_is_at_the_profile_view_page() {
		System.out.println("Scenario 1 step 1");
	}

	@When("user clicks on view profile button")
	public void user_clicks_on_view_profile_button() {
		System.out.println("Scenario 1 step 2");
	}

	@Then("profile gets display")
	public void profile_gets_display() {
		System.out.println("Scenario 1 step 3");
	}

	@Given("User is at the edit profile page")
	public void user_is_at_the_edit_profile_page() {
		System.out.println("Scenario 2 step 1");
	}
	
	@When("user clicks on Edit profile icon")
	public void user_clicks_on_edit_profile_icon() {
		System.out.println("Scenario 2 step 2");
	}

	@Then("profile gets display in editable mode")
	public void profile_gets_display_in_editable_mode() {
		System.out.println("Scenario 2 step 3");
	}
	
	@Given("User is at the delete profile page")
	public void user_is_at_the_delete_profile_page() {
		System.out.println("Scenario 3 step 1");
	}

	@When("user clicks on delete profile icon")
	public void user_clicks_on_delete_profile_icon() {
		System.out.println("Scenario 3 step 2");	
	}

	@Then("confirmation pop up should get appears")
	public void confirmation_pop_up_should_get_appears() {
		System.out.println("Scenario 3 step 3");
	}

}
