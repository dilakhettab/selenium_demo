package test_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://online.actitime.com/tcg/login.do");
		
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("succefull link click");
		
	}

}
