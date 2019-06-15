package test_browser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class UserVerification  extends demoguru9 {
	
	public void launchguru9() {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr197118");
		System.out.println("Successfully entered username");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jadujUr");
		System.out.println("Sucessfully entered password");
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		WebElement messi = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]"));
		
		Boolean statuc = messi.isDisplayed();
		
		if(statuc) {
			
			System.out.println("Sucessufully log in");
			
		}
		screenshot();
	}
	
	//SCREENSHOT
	 public void screenshot() {
		 
		 TakesScreenshot ball = ((TakesScreenshot)driver);
		 
		 File source =  ball.getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(source, new File("C:\\Users\\Fadhila\\OneDrive\\Pictures\\SC\\screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println("Guru99 screenshot captured");
	 }
	  public static void main(String[] args) {
		  UserVerification object = new UserVerification();
		  object.launchChrome();
		  object.launchguru9();
	  }

}
