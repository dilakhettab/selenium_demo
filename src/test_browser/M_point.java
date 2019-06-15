package test_browser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M_point {
	
	static WebDriver driver;
	
	public static void screem(String string) throws IOException {
		//String name ="picture.png";
				String directories ="C:\\Users\\Fadhila\\OneDrive\\Pictures\\SC\\";
				File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sourcefile, new File(directories + string));
	}
			

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Test Automation\\jar\\chromedriver.exe");
		driver=  new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		screem("watch.jpg");
		Actions obj = new Actions(driver);
		WebElement obj1= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
				obj.moveToElement(obj1).build().perform();
	driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
	
	screem("string.png");
	}		
}