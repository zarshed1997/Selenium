package Week1.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");
        WebElement books=chrome.findElement(By.partialLinkText("Books"));
        books.click();
        Select sortBy=new Select(chrome.findElement(By.id("products-orderby")));
        sortBy.selectByVisibleText("Price: Low to High");
        List<WebElement> addToCarts = chrome.findElements(By.cssSelector(".button-2.product-box-add-to-cart-button"));
        WebElement addToCart1 = addToCarts.get(0);
        addToCart1.click();
        WebElement shoppingCart=chrome.findElement(By.partialLinkText("Shopping cart"));
        shoppingCart.click();
        WebElement agrement=chrome.findElement(By.id("termsofservice"));
        agrement.click();
        WebElement checkOut=chrome.findElement(By.id("checkout"));
        checkOut.click();
        WebElement checkOutAsGuest=chrome.findElement(By.cssSelector("#button-1.checkout-as-guest-button"));
        checkOutAsGuest.click();
        WebElement firstName=chrome.findElement(By.id("BillingNewAddress_FirstName"));
        firstName.sendKeys("John");
        WebElement lastName=chrome.findElement(By.id("BillingNewAddress_LastName"));
        lastName.sendKeys("Jones");
        WebElement email=chrome.findElement(By.id("BillingNewAddress_Email"));
        email.sendKeys("John123@gmail.com");
        Select country=new Select(chrome.findElement(By.id("BillingNewAddress_CountryId")));
        country.selectByVisibleText("United States");
        WebElement city=chrome.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("Brookly");
        WebElement address=chrome.findElement(By.id("BillingNewAddress_Address1"));
        address.sendKeys("123 nowhere");
        WebElement zipcode=chrome.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipcode.sendKeys("11230");
        WebElement phoneNumber=chrome.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("1234567890");

        WebElement selectBillingAddress =chrome.findElement(By.cssSelector("#billing-buttons-container .button-1.new-address-next-step-button"));
        selectBillingAddress.click();
        Thread.sleep(2000);
        WebElement pickUpStore =chrome.findElement(By.cssSelector("#PickUpInStore"));
        pickUpStore.click();
        WebElement shippingAddress=chrome.findElement(By.cssSelector("#checkout-step-shipping .button-1.new-address-next-step-button"));
        shippingAddress.click();
        Thread.sleep(2000);
        WebElement shippingMethod=chrome.findElement(By.cssSelector("#shipping-method-buttons-container .button-1.shipping-method-next-step-button"));
        shippingMethod.click();
        Thread.sleep(2000);
        WebElement paymentMethod =chrome.findElement(By.cssSelector("#payment-method-buttons-container .button-1.payment-method-next-step-button"));
        paymentMethod.click();
        Thread.sleep(2000);
        WebElement paymentInfo = chrome.findElement(By.cssSelector("#payment-info-buttons-container .button-1.payment-info-next-step-button"));
        paymentInfo.click();
        Thread.sleep(2000);
        WebElement confirmOrder =chrome.findElement(By.cssSelector("#confirm-order-buttons-container .button-1.confirm-order-next-step-button"));
        confirmOrder.click();
        Thread.sleep(3000);

        WebElement orderNumber=chrome.findElement(By.cssSelector(".section.order-completed"));
        String rawText = orderNumber.getText();
        System.out.println(rawText);
   //     WebElement homePage =chrome.findElement(By.cssSelector(".button-2.order-completed-continue-button"));
 //       homePage.click();
        Thread.sleep(3000);




    }
}
