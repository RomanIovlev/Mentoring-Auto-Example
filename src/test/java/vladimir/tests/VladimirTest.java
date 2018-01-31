package vladimir.tests;

import org.testng.annotations.Test;
import vladimir.TestsInit;

import static vladimir.pageobject.ContactsPage.*;
import static vladimir.pageobject.HomePage.*;


public class VladimirTest extends TestsInit {

    @Test
    public void first() {
        userIcon().click();
        login("epam", "1234");
        checkIsLoggedIn();
        logoutButton().click();
        checkIsLoggedOut();
    }

    @Test
    public  void second() {
        login("epam", "1234");
        supportLabel().click();
        dropDownToggle().click();
        logoutButton().click();
        checkIsLoggedOut();
  }

  @Test
  public void third() {
      userIcon().click();
      login("epam", "1234");
      contactFormLabel().click();
      contactFormName().sendKeys("Vladimir");
      contactFormLastName().sendKeys("Nemtcev");
      contactFormDescription().sendKeys("Hello World,Hello World,Hello World,Hello World");
      webFormSubmitButton().click();
      logoutButton().click();
      checkIsLoggedOut();
  }

}

