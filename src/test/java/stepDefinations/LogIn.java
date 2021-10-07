package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class LogIn{

    @Given("Customer is landed to demo shop home page login")
    public void customer_is_landed_to_demoshop_home_page_login() {

    }

    @When("Customer clicks on log in")
    public void customer_clicks_on_log_in() throws InterruptedException {
        Thread.sleep(1000);
        chrome.findElement(By.cssSelector("a.ico-login")).click();
      
    }

    @Then("Customer should land on sign in page")
    public void customer_should_land_on_sign_in_paga() {
        String title =chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Welcome, Please Sign In!", title);
    }

    @When("Customer enters email")
    public void customer_enters_email() {
        WebElement login= chrome.findElement(By.cssSelector(".inputs #Email"));
        login.sendKeys("123412341234@gmail.com");
    }

    @When("Customer enters valid password")
    public void customer_enters_valid_password() {
        WebElement password=chrome.findElement(By.cssSelector(".inputs #Password"));
        password.sendKeys("123412341234");
    }

    @When("Customer click to remember me")
    public void customer_click_to_remember_me() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement rememberMeCheckbox= chrome.findElement(By.cssSelector(".inputs.reversed #RememberMe"));
        rememberMeCheckbox.click();
      
    }

    @When("Customer click on log in")
    public void customer_click_on_log_in() {
        WebElement logInTap=chrome.findElement(By.cssSelector(".buttons .button-1.login-button"));
        logInTap.click();
    }

    @Then("Customer should see log out")
    public void customer_should_see_log_out() {
        String logOut= chrome.findElement(By.cssSelector(".ico-logout")).getText();
        assertEquals("Log out",logOut);
      
    }
    
}
