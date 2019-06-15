package test_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class create_account {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
		driver.get(url);
		driver.findElement(By.id("firstName")).sendKeys("fadhila");
		driver.findElement(By.id("lastName")).sendKeys("khettab");
		driver.findElement(By.id("username")).sendKeys("khettabfadhila@gmail.com");
	
		driver.findElement(By.name("Passwd")).sendKeys("dila123@");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("dila123@");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("202 8696 729");
		driver.findElement(By.xpath("//*[@id=\"gradsIdvPhoneNext\"]/content/span")).click();

	}

}
