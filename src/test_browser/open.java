package test_browser;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class open {
	public static WebDriver driver=null;

	public static <WebElemet> void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//driver.get("https://www.facebook.com");
         //driver.get("https://www.google.com/");
		//driver.manage().logs().getAvailableLogTypes();
		String url="https://www.facebook.com";
	
		/*driver.get(url);
		
		
		
		//get tital of the page
		
		
		/*String gettitle =driver.getTitle();
		System.out.println("the title for the page:"  +gettitle);*/
		
		 driver.navigate().to(url);
		// driver.navigate().back();
		// driver.navigate().forward();
		// driver.navigate().notifyAll();
		 
		//id
		//driver.findElement(By.id("email")).sendKeys("fayla");
		WebElement emailfield=driver.findElement(By.id("email")) ;
		
		emailfield.sendKeys("fayla"); 
		emailfield.clear();
		emailfield.sendKeys("dila");
		
		
		//name
		
		WebElement passwd=driver.findElement(By.name("pass"));
		passwd.sendKeys("dila12345");
		  
		//link.text
		@SuppressWarnings("unused")
		WebElement link=driver.findElement(By.linkText("Forgot account?"));
		//link.click();
		 
		//partiallinktext
		WebElement shortLinkText=driver.findElement(By.partialLinkText("Forgot"));
		shortLinkText.click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}
}
