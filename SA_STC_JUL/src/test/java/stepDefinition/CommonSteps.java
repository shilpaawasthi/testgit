package stepDefinition;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Log;
import webconnector.WebConnector;

public class CommonSteps {	
	
	WebConnector selenium = new WebConnector();

	@Given("^the Runmode is \"([^\"]*)\"$")
	public void Runmode_is(String runmode) {		
		Log.info("Checking test run mode");
		if (runmode.equals("N")) {
			Log.info("Skipping test as Runmode is No");
			throw new PendingException("Skipping test as Runmode is No");
		}
		Log.info("Starting test");
	}
	
	@When("^I navigate to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_navigate_to(String url, String browser) throws InterruptedException {
		selenium.openBrowser(browser);
		selenium.navigate(url);
	}
	

	@Given("^\"([^\"]*)\" element is present$")
	public void Element_Is_Present(String object) {
		Assert.assertTrue("Object not found " + object, selenium.checkElementExists(object));
	}

	@Then("^\"([^\"]*)\" element should be present$")
	public void element_should_be_present(String object) {
		Assert.assertTrue("Object not found " + object, selenium.checkElementExists(object));
	}

	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String object) throws InterruptedException {
		selenium.click(object);

	}

	@When("^I click \"([^\"]*)\"$")
	public void I_click(String object) throws InterruptedException {
		selenium.click(object);
	}

}
