package Week1.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get("https://www.google.com/");
        WebElement googleSearch=chrome.findElement(By.name("q"));
        googleSearch.sendKeys("Facebook");
        googleSearch.submit();
        WebElement facebookLink=chrome.findElement(By.partialLinkText("Facebook - Log In or Sign Up"));
        facebookLink.click();
        chrome.quit();

    }
}
