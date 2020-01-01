/*
 * package StepDefinition;
 * 
 * import java.util.List; import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import DataProvider.ConfigFileReader; import Managers.FileReaderManager;
 * import Managers.PageObjectManager; import Managers.WebDriverManager; import
 * PageObjects.CartPage; import PageObjects.CheckoutPage; import
 * PageObjects.HomePage; import PageObjects.ProductListingPage; import
 * cucumber.api.java.en.Given; import cucumber.api.java.en.When;
 * 
 * public class StepDefinition {WebDriver driver; HomePage homePage;
 * ProductListingPage productListingPage; CartPage cartPage; CheckoutPage
 * checkoutPage; PageObjectManager pageObjectManager; WebDriverManager
 * webDriverManager;
 * 
 * 
 * @Given("user is on Home Page") public void user_is_on_Home_Page(){
 * webDriverManager = new WebDriverManager(); driver =
 * webDriverManager.getDriver(); pageObjectManager = new
 * PageObjectManager(driver); homePage = pageObjectManager.getHomePage();
 * homePage.navigateTo_HomePage(); }
 * 
 * @When("he search for \"([^\"]*)\"") public void he_search_for(String product)
 * { homePage.perform_Search(product); }
 * 
 * @When("choose to buy the first item") public void
 * choose_to_buy_the_first_item() { productListingPage =
 * pageObjectManager.getProductListingPage();
 * productListingPage.select_Product(0); productListingPage.clickOn_AddToCart();
 * }
 * 
 * @When("moves to checkout from mini cart") public void
 * moves_to_checkout_from_mini_cart(){ cartPage =
 * pageObjectManager.getCartPage(); cartPage.clickOn_Cart();
 * cartPage.clickOn_ContinueToCheckout(); }
 * 
 * 
 * @When("select same delivery address") public void
 * select_same_delivery_address(){
 * checkoutPage.check_ShipToDifferentAddress(false); }
 * 
 * @When("select payment method as \"([^\"]*)\" payment") public void
 * select_payment_method_as_payment(String arg1){
 * checkoutPage.select_PaymentMethod("CheckPayment"); }
 * 
 * @When("place the order") public void place_the_order() {
 * checkoutPage.check_TermsAndCondition(true);
 * checkoutPage.clickOn_PlaceOrder(); webDriverManager.closeDriver(); } }
 */