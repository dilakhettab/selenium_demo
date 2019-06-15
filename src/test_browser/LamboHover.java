package test_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LamboHover {
 
	public static WebDriver driver;
	
 	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver =  new ChromeDriver();
		System.out.println("Succesfuly Launched Browser");
		OpenUrl();
	}
	
	public void OpenUrl() {
		
		driver.get("https://www.lamborghini.com/en-en");
		driver.manage().window().maximize();
		String url= driver.getTitle();
		System.out.println("succesfuly opened the url: "+url);
		Hover();
	}
	
	public void Hover() {
		Actions action= new Actions(driver);
		
     WebElement first = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div[3]/nav/ul[1]/li[1]/a"));
     action.moveToElement(first);
     try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     action.build().perform();
     //second
     WebElement second = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div[3]/nav/ul[1]/li[2]/a"));
     action.moveToElement(second);
     try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     action.build().perform();
     //third
     WebElement third = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div[3]/nav/ul[1]/li[3]/a"));
     action.moveToElement(third);
     try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     action.build().perform();
     
     //4th
     WebElement fourth= driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/div[3]/nav/ul[1]/li[4]/a"));
     action.moveToElement(fourth);
     try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     action.build().perform();
     //new
     WebElement news= driver.findElement(By.xpath("//*[@id=\"submenu_3\"]/li[1]/a"));
     action.moveToElement(news).click();   
     try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     action.build().perform();
	}
	
	public static void main(String[] args) {
		LamboHover run = new LamboHover();
		
		run.OpenBrowser();
	}
	
	
}
