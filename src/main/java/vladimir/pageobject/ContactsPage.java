package vladimir.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static vladimir.driver.DriverManager.delay;
import static vladimir.driver.DriverManager.driver;

/**
 * Created by Roman_Iovlev on 1/31/2018.
 */
public class ContactsPage {
    public static WebElement contactFormName(){ delay(); return driver.findElement(By.id("Name")); }
    public static WebElement contactFormLastName(){ delay(); return driver.findElement(By.id("LastName")); }
    public static WebElement contactFormDescription(){ delay(); return driver.findElement(By.id("Description")); }
    public static WebElement webFormSubmitButton(){ delay(); return driver.findElement(By.xpath("//*[@id='user-data']//button[text()='Submit']")); }
}
