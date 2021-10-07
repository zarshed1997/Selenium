package Week1.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome =new ChromeDriver();
        chrome.get("https://www.amazon.com/");
        WebElement searchBar = chrome.findElement(By.name("field-keywords"));
        searchBar.sendKeys("Tv");
        searchBar.submit();
        WebElement productlink = chrome.findElement(By.partialLinkText("Introducing Amazon Fire TV 50\" 4-Series 4K UHD smart TV"));
        productlink.click();
        WebElement addToCart = chrome.findElement(By.id("buy-now-button"));
        addToCart.submit();
        WebElement checkOut = chrome.findElement(By.id("a-autoid-0-announce"));
        checkOut.click();
        WebElement signIn = chrome.findElement(By.id("ap_email"));
        signIn.sendKeys("zarshed1997@gmail.com");
        signIn.submit();
        chrome.quit();
    }
}
