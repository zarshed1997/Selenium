package Week1.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get("https://www.amazon.com/");
        WebElement seachbar= chrome.findElement(By.name("field-keywords"));
        seachbar.sendKeys("Gopro");
        WebElement search= chrome.findElement(By.id("nav-search-submit-button"));
        search.click();
    }
}
