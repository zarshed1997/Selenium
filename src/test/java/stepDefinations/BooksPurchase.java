package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class BooksPurchase {

    @Given("Customer landed to Demoshop home page")
    public void custumer_landed_to_demoshop_home_page() {


    }

    @Then("Custumer should see the books hearer")
    public void custumer_should_see_the_books_hearer() {
        WebElement title = chrome.findElement(By.cssSelector(".page-title"));
//        System.out.println(title.getText());
        assertEquals("Books", title.getText());
    }


    @Then("Custumer should see sort by element")
    public void custumer_should_see_sort_by_element() {
        WebElement sortBy=chrome.findElement(By.cssSelector("#products-orderby"));
        System.out.println(sortBy.isDisplayed());
    }


    @Then("custumer shoukd see update cart")
    public void custumer_shoukd_see_update_cart() throws InterruptedException {
        Thread.sleep(3000);
        WebElement shoppingCart=chrome.findElement(By.cssSelector(".cart-qty"));
     //   System.out.println(shoppingCart.getText());
        assertEquals("(1)",shoppingCart.getText() );
    }

    @When("Custumer clicks on cart")
    public void custumer_clicks_on_cart() {
        WebElement shoppingCart = chrome.findElement(By.partialLinkText("Shopping cart"));
        shoppingCart.click();
    }

    @Then("Custumer should land on shopping cart paga")
    public void custumer_should_land_on_shopping_cart_paga() {
        WebElement cartTitle=chrome.findElement(By.cssSelector(".page-title"));
 //       System.out.println(cartTitle.getText());
        assertEquals("Shopping cart", cartTitle.getText());

    }

    @When("Custumer Clicks on books")
    public void custumer_clicks_on_books() {
        WebElement books = chrome.findElement(By.partialLinkText("Books"));
        books.click();
    }

    @When("Custumer changes sort by low to high")
    public void custumer_changes_sort_by_low_to_high() {
        Select sortBy = new Select(chrome.findElement(By.id("products-orderby")));
        sortBy.selectByVisibleText("Price: Low to High");
    }

    @When("Custumer enter fist name")
    public void custumer_enter_fist_name() {
        WebElement firstName = chrome.findElement(By.id("BillingNewAddress_FirstName"));
        firstName.sendKeys("John");
    }

    @When("Custumer changes sort by {string}")
    public void custumer_changes_sort_by() {
        Select sortBy = new Select(chrome.findElement(By.id("products-orderby")));
        sortBy.selectByVisibleText("Price: Low to High");
    }

    @When("Custumer adds the first book to cart")
    public void custumer_adds_the_first_book_to_cart() {
        List<WebElement> addToCarts = chrome.findElements(By.cssSelector(".button-2.product-box-add-to-cart-button"));
        WebElement addToCart1 = addToCarts.get(0);
        addToCart1.click();

    }


    @When("Custumer shooses USA")
    public void custumer_shooses_usa() {

    }

    @When("Custumer agrees to term and conditions")
    public void custumer_agrees_to_term_and_conditions() {
        WebElement agrement = chrome.findElement(By.id("termsofservice"));
        agrement.click();
    }

    @When("Custumer click on checkout")
    public void custumer_click_on_checkout() {
        WebElement checkOut = chrome.findElement(By.id("checkout"));
        checkOut.click();
    }

    @Then("Custumer should be redirected to Sign-in paga")
    public void custumer_should_be_redirected_to_sign_in_paga() throws InterruptedException {
    //    Thread.sleep(3000);
        chrome.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement signInTitle =chrome.findElement(By.cssSelector(".page-title"));
    //    System.out.println(signInTitle.getText());
        assertEquals("Welcome, Please Sign In!",signInTitle.getText());


    }

    @When("Custumer click on check-out-as-guest bnutton")
    public void custumer_click_on_check_out_as_guest_bnutton() {
        WebElement checkOutAsGuest = chrome.findElement(By.cssSelector(".button-1.checkout-as-guest-button"));
        checkOutAsGuest.click();
    }

    @Then("Custumer is redirected to checkout")
    public void custumer_is_redirected_to_checkout() throws InterruptedException {
        Thread.sleep(3000);
        WebElement checkOutTitle =chrome.findElement(By.cssSelector(".page-title"));
    //    System.out.println(checkOutTitle.getText());
        assertEquals("Checkout", checkOutTitle.getText());


    }

    @When("Custumer enters first name")
    public void custumer_enters_first_name() throws InterruptedException {
      //  Thread.sleep(3000);
        chrome.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement firstName = chrome.findElement(By.id("BillingNewAddress_FirstName"));
        firstName.sendKeys("John");
    }

    @When("Custumer enters last name")
    public void custumer_enters_last_name() {
        WebElement lastName = chrome.findElement(By.id("BillingNewAddress_LastName"));
        lastName.sendKeys("Jones");
    }

    @When("Custumer enters email")
    public void custumer_enters_email() {
        WebElement email = chrome.findElement(By.id("BillingNewAddress_Email"));
        email.sendKeys("John123@gmail.com");
    }

    @When("custumer chooses a country")
    public void custumer_chooses_a_country() {
        Select country = new Select(chrome.findElement(By.id("BillingNewAddress_CountryId")));
        country.selectByVisibleText("United States");
    }

    @When("Custumer enters city")
    public void custumer_enters_city() {
        WebElement city = chrome.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("Brookly");
    }

    @When("Custumer enters address")
    public void custumer_enters_address() {
        WebElement address = chrome.findElement(By.id("BillingNewAddress_Address1"));
        address.sendKeys("123 nowhere");
    }

    @When("Custumer enters zipcode")
    public void custumer_enters_zipcode() {
        WebElement zipcode = chrome.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipcode.sendKeys("11230");
    }

    @When("Custumer enters phone")
    public void custumer_enters_phone() {
        WebElement phoneNumber = chrome.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("1234567890");
    }
    @When("Customer clicks on pick-up in store checkbox")
    public void customer_clicks_on_pick_up_in_store_checkbox() {
        chrome.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement pickUpStore =chrome.findElement(By.cssSelector("#PickUpInStore"));
        pickUpStore.click();
    }

    @When("Customer clicks on continue button")
    public void customer_clicks_on_continue_button() {

    }

    @Then("Shipping method becomes inactive")
    public void shipping_method_becomes_inactive() {

    }


    @When("Custumer click on continue")
    public void custumer_click_on_continue() {

        WebElement selectBillingAddress = chrome.findElement(By.cssSelector("#billing-buttons-container .button-1.new-address-next-step-button"));
        selectBillingAddress.click();
    }

    @Then("Billing tab becomes inactive")
    public void billing_tab_becomes_inactive() throws InterruptedException {
        Thread.sleep(3000);
        WebElement billingTop=chrome.findElement(By.cssSelector("#opc-billing"));
     //   System.out.println(billingTop.isEnabled());
        assertEquals(true,billingTop.isEnabled() );
    }

    @Then("shipping tab become active")
    public void shipping_tab_become_active() {



    }

    @When("Custumer clicks on continue button")
    public void custumer_clicks_on_continue_button() throws InterruptedException {
        Thread.sleep(2000);
        WebElement shippingAddress = chrome.findElement(By.cssSelector("#checkout-step-shipping .button-1.new-address-next-step-button"));
        shippingAddress.click();
    }

    @Then("payment tab become active")
    public void payment_tab_become_active() {

    }

    @When("Customer clicks on shipping continue")
    public void customer_clicks_on_shipping_continue() throws InterruptedException {
        chrome.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement shippingMethod = chrome.findElement(By.cssSelector("#shipping-method-buttons-container .button-1.shipping-method-next-step-button"));
        shippingMethod.click();
    }

    @Then("Shipping tab is deactivated")
    public void shipping_tab_is_deactivated() {

    }


    @When("Custumer click on payment continue")
    public void custumer_click_on_payment_continue() {
        WebElement shippingMethod = chrome.findElement(By.cssSelector("#shipping-method-buttons-container.button-1.shipping-method-next-step-button"));
        shippingMethod.click();
    }


    @Then("Confirm paga become active")
    public void confirm_paga_become_active() {

    }

    @When("Customer slicks on payment info continue")
    public void customer_slicks_on_payment_info_continue() throws InterruptedException {
        Thread.sleep(2000);
        WebElement paymentInfo = chrome.findElement(By.cssSelector("#payment-info-buttons-container .button-1.payment-info-next-step-button"));
        paymentInfo.click();
    }

    @Then("Payment tab is deactivated")
    public void payment_tab_is_deactivated() {

    }

    @When("Custumer click on confirm continue")
    public void custumer_click_on_confirm_continue() throws InterruptedException {
        Thread.sleep(2000);
        WebElement confirmOrder = chrome.findElement(By.cssSelector("#confirm-order-buttons-container .button-1.confirm-order-next-step-button"));
        confirmOrder.click();
    }

    @When("Custumer click on payment method continue")
    public void custumer_click_on_payment_method_continue() throws InterruptedException {
        Thread.sleep(2000);
        WebElement paymentMethod = chrome.findElement(By.cssSelector("#payment-method-buttons-container .button-1.payment-method-next-step-button"));
        paymentMethod.click();

    }

    @Then("Order number is generated")
    public void order_number_is_generated() throws InterruptedException {
        Thread.sleep(2000);
        WebElement orderNumTitle=chrome.findElement(By.cssSelector(".title"));
     //   System.out.println(orderNumTitle.getText());
        assertEquals("Your order has been successfully processed!", orderNumTitle.getText());


    }
}


