package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class ShareWithaFriend {
    @When("Customer click to book")
    public void customer_click_to_book() {
        chrome.findElement(By.cssSelector(".product-title")).click();
    }
    @When("Customer click email a friend button")
    public void customer_click_email_a_friend_button() throws InterruptedException {
        Thread.sleep(1000);
        chrome.findElement(By.cssSelector(".email-a-friend")).click();
    }
    @Then("Verify Customer is on email a friend tab")
    public void verify_customer_is_on_email_a_friend_tab() throws InterruptedException {
        Thread.sleep(1000);
        String title = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Email a friend",title);
    }
    @When("Customer enters friend's email")
    public void customer_enters_friend_s_email() {
        chrome.findElement(By.cssSelector("#FriendEmail")).sendKeys("Mike@gmail.com");
        
    }

    @When("Customer click on send email")
    public void customer_click_on_send_email() {
        chrome.findElement(By.cssSelector(".button-1.send-email-a-friend-button")).click();
        
    }
    @Then("Verify Your message has been sent")
    public void verify_your_message_has_been_sent() throws InterruptedException {
        Thread.sleep(1000);
        String tite2=chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Email a friend",tite2);

        
    }

}
