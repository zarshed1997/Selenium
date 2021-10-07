package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class WishList {
    @When("Click on book")
    public void click_on_book() throws InterruptedException {
        chrome.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        chrome.findElement(By.cssSelector(".product-title")).click();
      
    }
    @When("Click on add to wishlist")
    public void click_on_add_to_wishlist() {
        chrome.findElement(By.cssSelector("#add-to-wishlist-button-22")).click();
      
    }
    @Then("wishlist cart should get updated \\({int}) to \\({int})")
    public void wishlist_cart_should_get_updated_to(Integer int1, Integer int2) throws InterruptedException {
        Thread.sleep(2000);
        String wishlist=chrome.findElement(By.cssSelector(".wishlist-qty")).getText();
        assertEquals("(1)",wishlist);
      
    }

}
