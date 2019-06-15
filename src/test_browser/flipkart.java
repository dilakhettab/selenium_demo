package test_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
@SuppressWarnings("unused")
public class flipkart {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("LM6RPg")).sendKeys("dell");
        //driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more'] ")).sendKeys("dell");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
	}

}
