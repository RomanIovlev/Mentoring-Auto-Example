package amazon.home.work.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static amazon.home.work.driver.DriverManager.driver;

public class SearchPage {
	public static WebElement resultLine() {
		return driver.findElement(By.cssSelector("#s-result-count .a-color-state"));
	}

	public static WebElement searchDropDownMenu() {
		return driver.findElement(By.xpath("//option[@value='search-alias=fashion-mens']"));
	}

	public static WebElement resultLabel() {
		return driver.findElement(By.xpath("//a[contains(text(),'Clothing, Shoes & Jewelry')]"));
	}

    public static WebElement unknounItemSearch() {
		return driver.findElement(By.id("noResultsTitle"));
	}
	public static List<WebElement> results() {
		return driver.findElements(By.cssSelector("#s-results-list-atf>li"));
	}
	public static WebElement searchResultTitle(int i) {
		return results().get(i).findElement(By.className("s-size-mild"));
	}
	public static String searchResultPrice(int i) {
		return results().get(i-1).findElement(By.className("sx-price-whole")).getText()
				+ "," + results().get(i-1).findElement(By.className("sx-price-fractional")).getText();
	}
	public static String searchResultPrice(String name) {
		List<WebElement> results = results();
		WebElement el = null;
		for(WebElement result: results)
			if (result.findElement(By.className("s-size-mild")).getText().equals(name)) {
				el = result;
				break;
			}
		if (el == null) return "";
		return el.findElement(By.className("sx-price-whole")).getText()
				+ "," + el.findElement(By.className("sx-price-fractional")).getText();
	}

}