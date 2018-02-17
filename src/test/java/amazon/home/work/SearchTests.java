package amazon.home.work;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static amazon.home.work.pageobjects.HomePage.searchButton;
import static amazon.home.work.pageobjects.HomePage.searchField;
import static amazon.home.work.pageobjects.SearchPage.*;
import static amazon.home.work.utils.ElementUtils.assertWaitEquals;
import static java.lang.System.currentTimeMillis;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends TestInit {

	@AfterMethod
	public void after() {
		searchField().clear();
	}

	@Test
	public void asimpleSearchTest() {
		searchField().sendKeys("jacket");
		searchButton().click();
		assertEquals(resultLine().getText(), "\"jacket\"");
	}

	@Test
	public void searchByMen() {
        searchDropDownMenu().click();
		searchField().clear();
		searchField().sendKeys("jacket");
		searchButton().click();
		assertEquals(resultLabel().getText(), "Clothing, Shoes & Jewelry");
	}

    @Test
	public void blablaSearch() throws InterruptedException {
		searchField().sendKeys("blablablahde");
		searchButton().click();
		assertWaitEquals(()->unknounItemSearch().getText(), "Your search \"blablablahde\" did not match any products.");
	}

	@Test
	public void resultsTest() {
		searchField().sendKeys("jacket");
		searchButton().click();
		assertEquals(resultLine().getText(), "\"jacket\"");
		assertEquals(searchResultPrice("KIWEN Men's Cotton Casual Wear Outwear Coat Jacket"), "29,99");
	}
}