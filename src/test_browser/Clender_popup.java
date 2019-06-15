package test_browser;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Class
 * Method/Constructor
 * Main Method
 */

public class Clender_popup {
	static WebDriver driver;
	
	public  static void screen(String string) throws IOException {
		// TODO Auto-generated method stub
		
		//String name ="picture.png";
		String directories ="C:\\Users\\Fadhila\\OneDrive\\Pictures\\SC\\";
		File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefile, new File(directories + string));
	}
		
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
		
		String url="http://expedia.com";
		driver.get(url);
		screen("picturebeforeclick.png");
        driver.findElement(By.id("package-departing-hp-package")).click();
		driver.findElement(By.xpath("//button[@type='button'and@data-day='26'and@data-month='4']")).click();
		
		//driver.findElement(By.xpath("//button[contains(text(),'31')]")).click();
//		 public void screenshot() {
//			 
//			 TakesScreenshot ball = ((TakesScreenshot)driver);
//			 
//			 File source =  ball.getScreenshotAs(OutputType.FILE);
//			 try {
//				FileUtils.copyFile(source, new File("C:\\Users\\Fadhila\\OneDrive\\Pictures\\SC\\screenshot.png"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		screen("screenshotaafterclick.png");
		
		driver.findElement(By.xpath("//*[@id=\"tab-vacation-rental-tab-hp\"]/span[2]")).click();
		screen("vacation.png");
		driver.findElement(By.xpath("//*[@id=\"tab-car-tab-hp\"]/span[2]")).click();
	screen("CARES.png");
		
	}

	
	}

