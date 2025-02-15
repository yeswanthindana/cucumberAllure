package pages;
import io.cucumber.java.sl.In;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.browserDriver;

public class HomePage extends browserDriver {


    public static String menu_xpath = "//*[@id=\"menuToggle\"]/input";

    public static String sign_in_linktext = "Sign In Portal";
    public static String onl_prod = "Online Products";

    // Adding methods

    public static void clickMenu() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(4000);
        driver.findElement(By.xpath(menu_xpath)).click();
    }

    public static void clickSignin() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.linkText(sign_in_linktext)).click();
    }

    public static void clickOnlineProducts() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.linkText(onl_prod)).click();
    }
}
