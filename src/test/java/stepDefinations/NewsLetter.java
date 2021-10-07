package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class NewsLetter
{


    @When("Customer enters email address for news")
    public void customer_enters_email_address_for_news() throws InterruptedException {
        Thread.sleep(2000);
        WebElement email=chrome.findElement(By.cssSelector("#newsletter-email"));
        email.sendKeys("zarshed@gmail.com");
    }
    @When("customer Click to Subscribe")
    public void customer_click_to_subscribe() {
      WebElement click =  chrome.findElement(By.cssSelector("#newsletter-subscribe-button"));
      click.click();
    }

    @Then("Customer submit form")
    public void customer_submit_form() throws InterruptedException {
        Thread.sleep(2000);
        String title = chrome.findElement(By.cssSelector(".newsletter-result-block")).getText();
        assertEquals("Thank you for signing up! A verification email has been sent. We appreciate your interest.", title);


    }

}
