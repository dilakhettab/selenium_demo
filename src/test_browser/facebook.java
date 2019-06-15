package test_browser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
       
		String url="https://www.facebook.com/";
		driver.get(url);
        String Windows=driver.getWindowHandle();
		System.out.println(Windows);
		//Relativeui 
	   String relativeui="//input[@id='email']";
       String xpath=("/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input[1]");
        driver.findElement(By.xpath(xpath)).sendKeys("fadila");
	   
	 driver.findElement(By.xpath(relativeui)).sendKeys("realtivexpapproach");
	 @SuppressWarnings("unused")
	String phone="//input[starts-with(@aria-label,'mobile number or') ]";
		String xpath1=("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]");
		driver.findElement(By.xpath(xpath1)).sendKeys("dila123");
		String xpath2=("/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input");
		driver.findElement(By.xpath(xpath2)).click();
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		WebElement month=driver.findElement(By.id("month"));
		WebElement day=driver.findElement(By.id("day"));
		WebElement year=driver.findElement(By.id("year"));
		 Select dropdowns=new Select(month);
		dropdowns.selectByVisibleText("Mar");
		Select days=new Select(day);
		days.selectByValue("10");
		Select yeardowns=new Select(year);
		yeardowns.selectByValue("2019");
		
		
	}
}
