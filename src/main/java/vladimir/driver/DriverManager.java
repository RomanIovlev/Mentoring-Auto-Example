package vladimir.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Roman_Iovlev on 1/31/2018.
 */
public class DriverManager {
    public static WebDriver driver;
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "c:/Selenium/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void delay() {
        try {
            Thread.sleep(0 * 1000);
        } catch (InterruptedException ex) { throw new RuntimeException(ex.getMessage()); }
    }

}
