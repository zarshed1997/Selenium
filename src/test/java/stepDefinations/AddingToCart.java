package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class AddingToCart {
    @Given("Customer is on DemoShop home page")
public void customer_is_on_demo_shop_home_page() {


    }

    @When("Customer search for a book")
    public void customer_search_for_a_book() {
        WebElement searchBar=chrome.findElement(By.cssSelector("#small-searchterms"));
        searchBar.sendKeys("book");
        searchBar.submit();
    }

    @Then("Customer is on search page")
    public void customer_is_on_search_page() {
       String ola= chrome.findElement(By.cssSelector(".page-title")).getText();
       assertEquals("Search",ola);
        
    }

    @When("Customer clicks to add to cart")
    public void customer_clicks_to_add_to_cart() {
        chrome.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button")).click();
        
    }

    @Then("shopping cart should get updated \\({int}) to \\({int})")
    public void shopping_cart_should_get_updated_to(Integer int1, Integer int2) throws InterruptedException {
        Thread.sleep(1000);
        String one= chrome.findElement(By.cssSelector(".cart-qty")).getText();
        assertEquals("(1)",one);
    }

}
