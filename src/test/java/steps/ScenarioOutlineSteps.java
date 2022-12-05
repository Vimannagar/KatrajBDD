package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {

	@Given("user is on the application landing page")
	public void user_is_on_the_application_landing_page() {
	   System.out.println("Step 1 for Given");
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() {
		 System.out.println("Step 2 for when");
	}

	@Then("login screen will get display")
	public void login_screen_will_get_display() {
		 System.out.println("Step 3 for then");
	}

	@When("user enters {string} in field inside username")
	public void user_enters_in_field(String string) {
		 System.out.println("Step 4 for when");
	}
	
	@When("user enters {string} in field inside password")
	public void enterPassword(String string) {
		 System.out.println("Step 5 for when");
	}
	
	@When("user click on login button over the screen")
	public void clickOnLogin()
	{
		System.out.println("Step 6 for when");
	}

	@Then("user gets login failed message")
	public void user_gets_login_failed_message() {
	    System.out.println("Step 7 for Then");
	}
	
	
}
