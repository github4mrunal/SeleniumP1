package Nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class NopcommerceEdge {
    public static void main(String[] args) {
        String URL = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title = driver.getTitle();
        boolean verifyTitle = title.equals("nopcommerce demo store");
        boolean Titlecontains = title.contains("login");
        System.out.println(title);
        System.out.println(verifyTitle);
        System.out.println(Titlecontains);
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();

    }
}
