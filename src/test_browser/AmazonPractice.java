package test_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPractice {
public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fadhila\\eclipse-workspace\\Driver2\\ChromeDriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.findElement(By.xpath("(//span[@class='nav-line-1'])[3]")).click();
		
		
		System.out.println("succefull link click");
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_email")));
		driver.findElement(By.id("ap_email")).sendKeys("khettabfadhila@gmail.com");
		System.out.println("succeful email");
		
		
		driver.findElement(By.id("ap_password")).sendKeys("dila123");
		System.out.println("succeful passwoord");
		
		

		
	}

}
