package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class OrderStatus {

    @When("Customer click to orders")
    public void customer_click_to_orders() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.partialLinkText("Orders")).click();
    }

    @Then("verify customer is on My account-order page")
    public void verify_customer_is_on_my_account_order_page() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String verify=chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("My account - Orders",verify);

    }
    @Then("Customer should see order number")
    public void customer_should_see_order_number() {
        String title=chrome.findElement(By.cssSelector(".info li:nth-child(1)")).getText();
        assertEquals("Order status: Pending",title);
    }
}
