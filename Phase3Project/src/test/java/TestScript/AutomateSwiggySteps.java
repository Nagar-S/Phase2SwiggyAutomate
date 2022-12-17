package TestScript;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomateSwiggySteps extends Driver
{
	@Given("a user is on home page of swiggy")
	public void a_user_is_on_home_page_of_swiggy() 
	{
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.swiggy.com/"));
	}

	@When("he enters a location {string}")
	public void he_enters_a_location(String string) 
	{
	    homePage.enterLocation(string);
	}

	@When("select the location from dropdown")
	public void select_the_location_from_dropdown() 
	{
	   homePage.selectLocation();
	}

	@When("then clicks on first search result")
	public void then_clicks_on_first_search_result() 
	{
	   searchResult.selectSearchResult();
	}

	@When("click on Add button")
	public void click_on_add_button() 
	{
	    selectResult.selectAddButton();
	}

	@When("click on checkout")
	public void click_on_checkout() 
	{
	  selectResult.selectCheckoutButton();
	}

	@When("click on Have an account? Log IN button")
	public void click_on_have_an_account_log_in_button() 
	{
	   checkoutPage.selectLoginButton();
	}

	@Then("Verify if user is able to see {string}")
	public void verify_if_user_is_able_to_see(String string) 
	{
		String expectedErrMsg=string;
		   String actualErrMsg=checkoutPage.getErrMsg();
		   Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}
}
