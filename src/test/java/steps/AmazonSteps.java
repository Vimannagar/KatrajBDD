package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {
	
	
	@Given("User should be at previously orders page")
	public void user_should_be_at_previously_orders_page() {
System.out.println("Given for previous order");

	}

	@When("user click on the order")
	public void user_click_on_the_order() {
		System.out.println("When for previous order");
		
	
	}
	
	@When("Click on few more link")
	public void click_on_few_more_link() {
	 System.out.println("And for When for previous order");
	}

	@Then("He should be able to see the order details")
	public void he_should_be_able_to_see_the_order_details() {
		System.out.println("Then for previous order");
	}
	
	

	@Then("User should see the profile avatar")
	public void user_should_see_the_profile_avatar() {
		 System.out.println("And for Then for previous order");
	}


}
