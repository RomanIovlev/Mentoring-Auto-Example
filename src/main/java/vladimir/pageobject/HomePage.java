package vladimir.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static vladimir.driver.DriverManager.delay;
import static vladimir.driver.DriverManager.driver;

/**
 * Created by Roman_Iovlev on 1/31/2018.
 */
public class HomePage {
    public static WebElement userIcon() {
        delay(); return driver.findElement(By.className("fa-user")); }
    public static WebElement loginField() { delay(); return driver.findElement(By.id("Login")); }
    public static WebElement passwordField() { delay(); return driver.findElement(By.id("Password")); }
    public static WebElement enterButton() { delay(); return driver.findElement(By.xpath("//button//*[text()='Enter']")); }
    public static WebElement logoutButton() { delay(); return driver.findElement(By.className("logout")); }
    public static WebElement dropDownToggle() { delay(); return driver.findElement(By.xpath(".uui-profile-menu .caret")); }
    public static WebElement supportLabel() { delay();
    return driver.findElement(By.xpath("//*[@class='sidebar-menu']//*[text()='Support']")); }
    public static WebElement contactFormLabel() { delay();
    return driver.findElement(By.xpath("//*[@class='sidebar-menu']//*[text()='Contact form']")); }

    public static WebElement leftMenu(String name) {
        return driver.findElement(By.xpath("//*[@class='sidebar-menu']//*[text()='" + name + "']"));
    }

    public static void login(String name, String password) {
        loginField().clear();
        loginField().sendKeys(name);
        passwordField().clear();
        passwordField().sendKeys(password);
        enterButton().click();
    }

    public static void checkIsLoggedIn() {
        boolean isLoggedIn = logoutButton().isDisplayed();
        Assert.assertTrue(isLoggedIn);
    }
    public static void checkIsLoggedOut() {
        boolean isLoggedOut = userIcon().isDisplayed();
        Assert.assertTrue(isLoggedOut);
    }

}
