package stepDefinations;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSuiteSetUp {

    public static WebDriver chrome;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chrome=new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");
    }

}
