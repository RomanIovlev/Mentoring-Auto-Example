package vladimir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import vladimir.driver.DriverManager;

import java.util.concurrent.TimeUnit;

import static vladimir.driver.DriverManager.driver;

/**
 * Created by Roman_Iovlev on 1/31/2018.
 */
public class TestsInit {

    @BeforeSuite
    public static void init() {
        DriverManager.init();
        driver.navigate().to("https://epam.github.io/JDI/index.html");
    }

    @AfterSuite
    public static void teardown() {
        driver.close();
    }
}
