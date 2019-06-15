package test_browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New_window {
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	String currentwindowreceive=driver.getWindowHandle();
	//System.out.println("The current parent window hanle is ="+currentwindow);
	WebElement forgotpssword=driver.findElement(By.linkText("Forgot account?"));
	
	
	@SuppressWarnings("unused")
	Actions act=new Actions(driver);
	act.keyDown(Keys.SHIFT).click(forgotpssword).build().perform();
	forgotpssword.sendKeys(Keys.chord(Keys.COMMAND,Keys.RETURN));
	Set <String> windowsbrowsers= driver.getWindowHandles();
	System.out.println(windowsbrowsers.size());
	
	 for(String nvigation:windowsbrowsers) {
		 if(nvigation !=currentwindowreceive) {
			 driver.switchTo().window(nvigation);
			 String ur=driver.getCurrentUrl();
			 System.out.println(ur);}}
			 driver.findElement(By.id("identify_email")).sendKeys("piit.com");
     		 Thread.sleep(1000);
		 
		// driver.findElement(By.id("u_0_5")).click();
		 //Thread.sleep(1000);
			 
		 
	 
	
	
	
}
}