package test_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_popup {
 public static WebDriver driver= null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
		
		String url="http://demo.automationtesting.in/Alerts.html";
		driver.get(url);
		//driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		//driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys(url);
		
	}

}
