package stepsDefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddProductPage;

public class AddProductSteps {
	WebDriver driver = Hooks.driver  ;
	AddProductPage add ;
	@When("the user clicks on add to cart icon")
	public void the_user_clicks_on_add_to_cart_icon() {
		add = new AddProductPage(driver);
		add.clickAdd();
	    
	}

	@When("the user clicks on order button")
	public void the_user_clicks_on_order_button() {
	    add.clickOrder();
	}

	@Then("the product added is displayed in the cart page")
	public void the_product_added_is_displayed_in_the_cart_page() {
	 
	}

}
