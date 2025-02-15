package pages;

import org.openqa.selenium.By;
import utility.browserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedIn extends browserDriver{

    public static String pc_x = "(//*[@id=\"ShoeType\"])[1]";
    public static String ps_x = "(//*[@id=\"ShoeType\"])[2]";
    public static String psn_x = "(//*[@id=\"ShoeType\"])[3]";

    public static void prodcat_shoe() throws InterruptedException{
        String pc = driver.findElement(By.xpath(pc_x)).getText();
        assertEquals(pc,"Formal Shoes");
        System.out.println(pc +" is available");
    }

    public static void prodcat_sports() throws InterruptedException{
        String ps = driver.findElement(By.xpath(ps_x)).getText();
        assertEquals(ps,"Sports");
        System.out.println(ps +" is available");
    }
    public static void prodcat_sneakers() throws InterruptedException{
        String psn = driver.findElement(By.xpath(psn_x)).getText();
        assertEquals(psn,"Sneakers");
        System.out.println(psn +" is available");
    }


    //*[@id="ShoeType"]
}
