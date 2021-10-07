package Week2.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeWorkCSS {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");
        WebElement clickLogIn= chrome.findElement(By.cssSelector(".header-links .ico-login"));
        clickLogIn.click();
        WebElement signInTitle =chrome.findElement(By.cssSelector(".page-title"));
        assertEquals("Welcome, Please Sign In!",signInTitle.getText());
        chrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement login= chrome.findElement(By.cssSelector(".inputs #Email"));
        login.sendKeys("Mike@gmail.com");
        WebElement password=chrome.findElement(By.cssSelector(".inputs #Password"));
        password.sendKeys("qwerty");
        WebElement rememberMeCheckbox= chrome.findElement(By.cssSelector(".inputs.reversed #RememberMe"));
        rememberMeCheckbox.click();
        Thread.sleep(1000);
        WebElement logInTap=chrome.findElement(By.cssSelector(".buttons .button-1.login-button"));
        logInTap.click();
        WebElement logOut= chrome.findElement(By.cssSelector(".header-links .ico-logout"));
        assertEquals("Log out",logOut.getText());
        Thread.sleep(1000);
        WebElement clickToLOgOut=chrome.findElement(By.cssSelector(".ico-logout"));
        clickToLOgOut.click();
        Thread.sleep(1000);

    }
}
