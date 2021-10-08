package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class Electronics {
    @When("Customer click to Electronics")
    public void customer_click_to_electronics() throws InterruptedException {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       chrome.findElement(By.partialLinkText("Electronics")).click();
    }

    @Then("Electronics page visible")
    public void electronics_page_visible() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       String title=chrome.findElement(By.cssSelector(".page.category-page> .page-title")).getText();
       assertEquals("Electronics",title);
    }
}
