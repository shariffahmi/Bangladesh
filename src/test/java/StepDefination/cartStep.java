package StepDefination;

import PageAction.ActionCart;
import Utility.TestBaseCart;
import io.cucumber.java.en.*;



public class cartStep extends TestBaseCart{
	ActionCart house = new ActionCart();
	
	
	@Given("launch {string}")
	public void launch(String string) throws Exception {
	    
	getURL("URL");
	
	Thread.sleep(3000);
	}

	@Then("Click login")
	public void click_login() {
	    house.Clicklogin();
	
	}

	@Then("Enter username and password and click login")
	public void enter_username_and_password_and_click_login() throws Throwable {
	    house.Enterusernameandpasswordandclicklogin(Propper.getProperty("UserName"),Propper.getProperty("password"));
	
	}

	@Then("Click Samsung6 hyperlink and add to cart")
	public void click_samsung6_hyperlink_and_add_to_cart() throws Throwable {
	    
		house.ClickSamsung6hyperlinkandaddtocart();
	}

	@Then("Click Cart")
	public void click_cart() {
	    
	house.ClickCart();
	}

	@Then("Verify Samsung6 added in cart")
	public void verify_samsung6_added_in_cart() {
		house.VerifySamsung6addedincart();
	}

}
