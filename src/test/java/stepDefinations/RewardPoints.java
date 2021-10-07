package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class RewardPoints {

    @When("Customer click to My account")
    public void customer_click_to_my_account() {
        chrome.findElement(By.partialLinkText("My account")).click();
    }

    @Then("Customer in on My account page")
    public void customer_in_on_my_account_page() throws InterruptedException {
        Thread.sleep(1000);
        String title=chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("My account - Customer info",title);
    }

    @When("Customer click to Reward tab")
    public void customer_click_to_reward_tab() {
        chrome.findElement(By.cssSelector(".list li:nth-child(6)")).click();
    }

    @Then("Verify my reward is {int}.")
    public void verify_my_reward_is(Integer int1) throws InterruptedException {
        Thread.sleep(1000);
       String rewardPoints =chrome.findElement(By.cssSelector(".current-balance")).getText();
       assertEquals("Your current balance is 0 reward points (0.00).",rewardPoints);
    }

}
