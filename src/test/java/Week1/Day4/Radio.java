package Week1.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome =new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");
        WebElement laptop = chrome.findElement(By.partialLinkText("14.1-inch Laptop"));
        laptop.click();
        WebElement addToCart=chrome.findElement(By.id("add-to-cart-button-31"));
        addToCart.click();
        WebElement shoppingCart=chrome.findElement(By.partialLinkText("Shopping cart"));
        shoppingCart.click();
        Select country=new Select(chrome.findElement(By.id("CountryId")));
        country.selectByVisibleText("United States");
        Select state=new Select(chrome.findElement(By.id("StateProvinceId")));
        state.selectByValue("4");
        WebElement agrement=chrome.findElement(By.id("termsofservice"));
        agrement.click();
        WebElement checkOut=chrome.findElement(By.id("checkout"));
        checkOut.click();
        WebElement signInEmail=chrome.findElement(By.id("Email"));
        signInEmail.sendKeys("mike@gmail.com");
        WebElement signInPassword=chrome.findElement(By.id("Password"));
        signInPassword.sendKeys("qwerty");
        signInPassword.submit();
  //      WebElement saveAcc=chrome.findElement(By.id("RememberMe"));
        //    saveAcc.click();
    //    WebElement logIn=chrome.findElement(By.partialLinkText("submit"));
     //   logIn.submit();



    }
}
