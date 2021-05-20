package Parallel;

import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends DriverFactory {

	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	

	
	@Given("User is on Application landing page")
	public void user_is_on_application_landing_page() {
		DriverFactory.getDriver().get("https://www.saucedemo.com/");
	}

	
	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
	   

	}

	@Then("User views logins screen")
	public void user_views_logins_screen() {
		
		String title = login.verifyLoginPageTitle();
		Assert.assertEquals(title, "Swag Labs");
	   
	}

	

	@When("User enters {string} in the username field")
	public void user_enters_in_the_username_field(String string) {
		
		login.InputUserName(string);
	    
	}

	
	@When("User enters {string} in the password field")
	public void user_enters_in_the_password_field(String string) {
		
		login.InputPassword(string);
	    
	}

	
	@Then("User gets login failed error message")
	public void user_gets_login_failed_error_message() {
		
		login.ClickOnLogin();
		
		login.verifyErrorOnLogin();
		
	   
	}
	

	


	
	}

	


