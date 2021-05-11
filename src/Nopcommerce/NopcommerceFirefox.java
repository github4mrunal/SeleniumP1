package Nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class NopcommerceFirefox {
    public static void main(String[] args) {
        String url = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver =  new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
String title = driver.getTitle();
boolean verifyTitle = title.equals("nop commerce demo store");
boolean verifyTitleContain = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        System.out.println(title);
String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();
    }
}
