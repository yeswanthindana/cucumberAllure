package pages;

import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.browserDriver;

import static pages.LoginPage.*;
public class LoginPage extends browserDriver {



    public static String userName = "//*[@id=\"usr\"]";
    public static String password = "//*[@id=\"pwd\"]";
    public static String submit = "//*[@id=\"second_form\"]/input";
    public static String register = "//*[@id=\"NewRegistration\"]";



    public static void enterUsername() throws InterruptedException{
        driver.findElement(By.xpath(userName)).sendKeys("bomb@gamil.com");
    }

    public static void enterPassword() throws InterruptedException {
        driver.findElement(By.xpath(password)).sendKeys("bomb123");
    }

    public static void submitButton() throws InterruptedException{
        driver.findElement(By.xpath(submit)).click();

    }

    public static void registerButton() throws InterruptedException{
        driver.findElement(By.xpath(register)).click();
    }

}
