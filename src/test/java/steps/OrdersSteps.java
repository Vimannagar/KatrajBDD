package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	
	@Given("user should be at amazon login page")
	public void user_should_be_at_amazon_login_page() {
	   System.out.println("Background step for login page");
	}

	@When("user enters the username")
	public void user_enters_the_username() {
		System.out.println("Background step for entering username");
	}

	@When("user enters the password")
	public void user_enters_the_password() {
		System.out.println("Background step for entering password");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		System.out.println("Background step for clicking on login button ");
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		System.out.println("Background step for login");
	}

	@When("user click on the previous order link")
	public void user_click_on_the_previous_order_link() {
		System.out.println("Scenario 1 for previous order");
	}

	@Then("user should see the previously placed order")
	public void user_should_see_the_previously_placed_order() {
		System.out.println("Scenario 1 for previous order details");
	}

	@When("user click on the order link")
	public void user_click_on_the_order_link() {
		System.out.println("Scenario 2 for current order");
	}

	@Then("user should see the placed order")
	public void user_should_see_the_placed_order() {
		System.out.println("Scenario 2 for current order details");
	}

}
