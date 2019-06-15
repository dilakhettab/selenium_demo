package test_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class open1 {
	public static WebDriver driver=null;
	//--Go to facebook page
	public static <WebElemet> void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
       
		String url="https://www.facebook.com";
		driver.navigate().to(url);
		//--Get tittle and print in the console
		String gettitle =driver.getTitle();
		System.out.println("the title for the page:"  +gettitle);
		
		//write script for move forward, back ward and refresh the page.
		driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 /*--Enter specific userid in the respective field
			--Enter specific password in the respective field
			--Click login button .
			--After login get respective url.
			--Print to console the url you got.*/
		 
			WebElement emailfield=driver.findElement(By.id("email")) ;
			
			emailfield.sendKeys("fadhila"); 
			
			WebElement passwd=driver.findElement(By.name("pass"));
			passwd.sendKeys("dila12345");
			  
			WebElement link=driver.findElement(By.linkText("Forgot account?"));
			link.click();
			System.out.println("account no found");
		 try {
		 
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
		 }catch(IllegalStateException e) {
		 }
		 
	}
		 

}
