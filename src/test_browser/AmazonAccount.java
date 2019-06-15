package test_browser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAccount {
	public static void screem(String amazon) throws IOException {
		//String name ="picture.png";
				String directories ="C:\\Users\\Fadhila\\OneDrive\\Pictures\\SC\\";
				File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sourcefile, new File(directories + amazon));
	}
public static WebDriver driver;
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fadhila\\eclipse-workspace\\Driver2\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		 
	    driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("dila");
		driver.findElement(By.name("email")).sendKeys("khettabdila8@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Dila123456@");
		driver.findElement(By.name("passwordCheck")).sendKeys("Dila123456@");
	 try {
		screem("amazon0.png");
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

    	driver.findElement(By.id("continue")).click();
		String screem = "amazon1.png";
		driver.findElement(By.name("code")).sendKeys("798936");
		try {
			screem("amazon.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("a-autoid-0")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		
	}

}
