package Week1.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get("http://www.google.com/");
        WebElement seachbar= chrome.findElement(By.name("q"));
        seachbar.sendKeys("Gopro");
 //       seachbar.submit();
        WebElement submitButton=chrome.findElement(By.name("btnK"));
        submitButton.click();
    }
}
