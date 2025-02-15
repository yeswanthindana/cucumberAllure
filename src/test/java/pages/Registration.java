package pages;


import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import utility.browserDriver;

import static org.junit.Assert.assertEquals;

public class Registration  extends browserDriver {



    public static String fn = "//*[@id='firstname']";
    public static String ln = "//*[@id='lastname']";
    public static String email = "//*[@id='emailId']";
    public static String cn = "//*[@id='contactNumber]";
    public static String usr =  "//*[@id='usr']";
    public static String pwd =  "//*[@id='pwd']";
    public static String sub =   "//*[@id='first_form'']/div/div[2]/center/input";

    public static void fillform() throws InterruptedException{
        driver.findElement(By.xpath(fn)).sendKeys("Bob");
        driver.findElement(By.xpath(ln)).sendKeys("marle");
        driver.findElement(By.xpath(email)).sendKeys("bob@hmao.com");
        driver.findElement(By.xpath(cn)).sendKeys("7456456445");
        driver.findElement(By.xpath(usr)).sendKeys("bober");
        driver.findElement(By.xpath(pwd)).sendKeys("boober");
    }

    public static void submit_Reg() throws InterruptedException{
        driver.findElement(By.xpath(sub)).click();
    }

    public static void title() throws InterruptedException{
       String tit = driver.getTitle();
       assertEquals(tit,"Ace Online Shoe Portal");
    }
}
