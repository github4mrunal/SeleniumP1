package Nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class NopcommerceIE {

    public static void main(String[] args) {
        String URL = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
String title = driver.getTitle();
boolean verifyTitle = title.equals("nopcommerce demo store");
boolean Titlecontains = title.contains("login");
        System.out.println(title);
        System.out.println(Titlecontains);
        System.out.println(verifyTitle);
        driver.close();

    }
}
