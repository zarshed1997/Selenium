package Week1.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get("https://www.ebay.com/");
        WebElement EbaySubmit= chrome.findElement(By.name("_nkw"));
        EbaySubmit.sendKeys("Iphone 13");
        EbaySubmit.submit();
     //   WebElement EbayClick= chrome.findElement(By.id("gh-btn"));
     //   EbayClick.click();
    }
}
