package StepDefinition;

import Cucumber.TestContext;
import cucumber.api.java.en.When;
import PageObjects.CartPage;

public class CartPageSteps {
	
	TestContext testContext;
	CartPage cartPage;
	
	public CartPageSteps(TestContext context) {
		testContext = context;
		cartPage = testContext.getPageObjectManager().getCartPage();
	}
	
	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart(){
		cartPage.clickOn_Cart();
		cartPage.clickOn_ContinueToCheckout();	
	}

}