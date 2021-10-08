package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class AddYourReview {
    @When("Click to add your review")
    public void click_to_add_your_review() {
       chrome.findElement(By.partialLinkText("Add your review")).click();
    }

    @Then("Verify Costumer is on Write your own review page")
    public void verify_costumer_is_on_write_your_own_review_page() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String VerifyReviewTitle= chrome.findElement(By.cssSelector(".write-review .title")).getText();
        assertEquals("Write your own review",VerifyReviewTitle);
    }

    @When("Costumer adding Review title")
    public void costumer_adding_review_title() throws InterruptedException {
        Thread.sleep(1000);
       WebElement text = chrome.findElement(By.cssSelector("#AddProductReview_Title"));
       text.sendKeys("test");
    }

    @When("Costumer adding Review text")
    public void costumer_adding_review_text() throws InterruptedException {
        Thread.sleep(1000);
        WebElement secondText = chrome.findElement(By.cssSelector("#AddProductReview_ReviewText"));
        secondText.sendKeys("test");
    }

    @When("Costumer choosing Rating radio button")
    public void costumer_choosing_rating_radio_button() throws InterruptedException {
        Thread.sleep(1000);
       chrome.findElement(By.cssSelector("#addproductrating_4")).click();
    }

    @When("Costumer submit review")
    public void costumer_submit_review() {
        chrome.findElement(By.cssSelector(".button-1.write-product-review-button")).click();
    }

    @Then("Verify Product review is successfully added")
    public void verify_product_review_is_successfully_added() {
        chrome.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String title=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
        assertEquals("Product review is successfully added.",title);
    }


}
