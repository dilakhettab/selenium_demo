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
import org.openqa.selenium.support.ui.Select;

public class Lamborghini {
	public static void screem(String string) throws IOException {
		//String name ="picture.png";
				String directories ="C:\\Users\\Fadhila\\OneDrive\\Pictures\\SC\\";
				File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sourcefile, new File(directories + string));
	}
	public static WebDriver driver=null;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.lamborghini.com/en-en");
		screem("cars.png");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div[3]/nav/ul[1]/li[1]/a")));	
		Thread.sleep(3000);
		action.build().perform();
		
		driver.findElement(By.xpath("(//a[@class='active'])[5]"));
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@ng-class'getActiveClass(1,0)'])[1]"));
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div[3]/nav/ul[1]/li[3]/a")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div[3]/nav/ul[1]/li[4]/a")).click();
        WebElement Nouvelles=driver.findElement(By.xpath("//*[@id=\\\"submenu_3\\\"]/li[1]/a"));
        @SuppressWarnings("unused")
		Select dropdowns=new Select(Nouvelles);
		
       // driver.findElement(By.xpath("//*[@id=\"submenu_3\"]/li[1]/a")).click();
        
 
        Thread.sleep(1000);
        
        
	}
}
