package amazon.home.work;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static amazon.home.work.driver.DriverManager.*;

public class TestInit {

	@BeforeSuite(alwaysRun = true)
	public static void setUp() {
		driver.navigate().to("https://www.amazon.com");
	}

	@AfterSuite(alwaysRun = true)
	public static void tearDown() {
		driver.quit();
	}

}
