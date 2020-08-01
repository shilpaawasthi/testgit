package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Log;
import webconnector.WebConnector;

public class SearchProduct {

	WebConnector selenium = new WebConnector();
	
	@When("^I enter \"([^\"]*)\" into \"([^\"]*)\"$")
	public void i_enter_into(String data, String object) throws InterruptedException {
		selenium.waitUntilElementIsVisible(object);
		selenium.type(object, data);
		selenium.sleep(2);
		
		// auto complete
		//selenium.waitUntilElementIsVisible("locationAutoCompleteLink");
		//selenium.actionClick("locationAutoCompleteLink");
		//selenium.sleep(2);
	}

	/*@Then("^test \"([^\"]*)\" should show \"([^\"]*)\"$")
	public void the_For_Sale_properties_results_page_should_show(String object, String expected) {
		try {
			String actual = selenium.readLabel(object);
			System.out.println("actual: " + actual);
			Assert.assertTrue(actual.contains(expected));
			Log.info("Sign in assertion passed");
		} catch (Exception e) {
			Log.fatal("assertion failed");
			Assert.fail(e.getMessage());
		} catch (AssertionError e) {
			Log.error("assertion failed");
			Assert.fail(e.getMessage());
		} finally {
			selenium.closeBrowser();
		}*/
	@And("^check outcomes \"([^\"]*)\"$")
	public void check_outcomes(String object) throws InterruptedException {
	    selenium.readLabel(object);
	    selenium.sleep(2);
	   
	}

	@And("^check \"([^\"]*)\"$")
	public void check(String object) throws InterruptedException {
	    selenium.readLabel(object);
	    selenium.sleep(10);
   
	 // auto complete
	 selenium.ScrollTillElement(object);
	
	 selenium.sleep(5);
	}

	@And("check Page {string}")
	public void check_Page(String string) {
	    
	}
	
	@Then("^the added product for result page \"([^\"]*)\" should show \"([^\"]*)\"$")
	public void the_added_product_for_result_page_should_show(String Count123, String expected) throws InterruptedException {
		selenium.sleep(5);
		try {
			System.out.println("actual: " + Count123);
			String actual = selenium.readLabel(Count123);
			System.out.println("actual: " + actual);
			Assert.assertEquals(expected, actual);
			Log.info("Sign in assertion passed");
		} catch (Exception e) {
			Log.fatal("assertion failed");
			Assert.fail(e.getMessage());
		} catch (AssertionError e) {
			Log.error("assertion failed");
			Assert.fail(e.getMessage());
		} finally {
			selenium.closeBrowser();
		}
	}
}
	
	

