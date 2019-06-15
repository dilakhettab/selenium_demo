package test_browser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWikipedia {

	private static WebDriver link;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org");
		link = null;
		((WebElement) link).click();
		Thread.sleep(50000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("seachInput"));
		 searchBox.sendKeys("Software");
		Thread.sleep(50000);
		driver.quit();
		
		
}
}
