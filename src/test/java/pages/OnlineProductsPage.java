package pages;

import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import utility.browserDriver;

import static org.junit.Assert.assertEquals;

public class OnlineProductsPage extends browserDriver {

    public static String fs_x = "/html/body/div[2]/center/div/i[1]";

    public static String gp_x = "/html/body/div[2]/table/tbody/tr[1]/td[1]";


    public static void clickonformalshoes() throws InterruptedException{
        driver.findElement(By.xpath(fs_x)).click();
    }

    public static void getprodexp() throws InterruptedException{
        String gp = driver.findElement(By.xpath(gp_x)).getText();
        assertEquals(gp,"   Classic Cheltenham");
    }
}
