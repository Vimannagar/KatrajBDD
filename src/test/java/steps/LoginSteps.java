package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	

@Given("User is at the login screen")
public void user_is_at_the_login_screen() {
    System.out.println("Step 1: at login screen");
}

@When("User enters the username")
public void user_enters_the_username() {
	  System.out.println("Step 2: Entering username");
}

@When("User enters the password")
public void user_enters_the_password() {
	  System.out.println("Step 3: Entering password");
}

@When("User clicks on login button")
public void user_clicks_on_login_button() {
	 System.out.println("Step 4: click on login button");
}

@Then("User should get login to application")
public void user_should_get_login_to_application() {
	 System.out.println("Step 5: user logged in");
}


}
