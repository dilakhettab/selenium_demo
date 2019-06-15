package test_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class edurekatest {
public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.edureka.co/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		
			driver.findElement(By.xpath("//*[@id=\"search-inp\"]")).sendKeys("Selenium Certification Training");
			driver.findElement(By.xpath("//*[@id=\"remote\"]/span[2]")).click();
		}
	}


