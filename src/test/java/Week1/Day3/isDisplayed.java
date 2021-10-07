package Week1.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
    public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver chrome= new ChromeDriver();
      chrome.get("http://demowebshop.tricentis.com/");
      WebElement laptop = chrome.findElement(By.partialLinkText("14.1-inch Laptop"));
      laptop.click();
      WebElement addYourReviewing=chrome.findElement(By.partialLinkText("Add your review"));
        System.out.println(addYourReviewing.isDisplayed());
    }
}
