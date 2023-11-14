package stepsDefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogiinPage;

public class LogSteps {
	WebDriver driver = Hooks.driver ;
	LogiinPage logiin ;
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		driver.get("https://cosmetique.tn/");
	}

	@When("the user clicks on connexion")
	public void the_user_clicks_on_connexion() {
		logiin = new LogiinPage(driver);
	    logiin.clickConnexion();
	}

	@When("the user clicks on monCompte")
	public void the_user_clicks_on_mon_compte() {
	    logiin.clickCompte();
	}

	@When("^the user enters (.*) and (.*)$")
	public void the_user_enters_email_and_password(String email, String password) {
	   logiin.credentials(email, password);
	}
	
	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
	    logiin.clickSubmit();
	}

	@Then("the user is on the profil page")
	public void the_user_is_on_the_profil_page() {
		logiin.checkInfoDisplayed();
	}

	@Then("an error message appears")
	public void an_error_message_appears() {
	    logiin.checkErrorDisplayed();
	}

}
