package test_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationtesting {
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		         driver.get("http://demo.automationtesting.in/Frames.html");
				driver.switchTo().frame(0);
				driver.switchTo().frame(driver.findElement(By.id("singleframe")));
				driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("fadila");
				
				driver.get("http://demo.automationtesting.in/Alerts.html");
				driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
				
				Thread.sleep(1000);
				driver.switchTo().alert().accept();
				
				
			
				//*[@id="nav-link-accountList"]/span[1]
	}

}
