package test_browser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenFacebookAccount {
 public static WebDriver driver = null;
 public static void screem(String snap) throws IOException {
		//String name ="picture.png";
				String directories ="C:\\Users\\Fadhila\\OneDrive\\Pictures\\SC\\";
				File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sourcefile, new File(directories + snap));
 }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fadhila\\eclipse-workspace\\Driver2\\ChromeDriver\\chromedriver.exe");
	 
	driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");

	driver.manage().window().maximize();
	/*
	
	driver.findElement(By.name("firstname")).sendKeys("dila");
	driver.findElement(By.name("lastname")).sendKeys("khettab");
	driver.findElement(By.name("reg_email__")).sendKeys("khettabdila8@gmail.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("khettabdila8@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("123456Dila");
	try {
		screem("facebook.png");
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	//Actions facebook = new Actions();
	WebElement month=driver.findElement(By.id("month"));
	WebElement day=driver.findElement(By.id("day"));
	WebElement year=driver.findElement(By.id("year"));
	 Select dropdowns=new Select(month);
	dropdowns.selectByVisibleText("Mar");
	Select days=new Select(day);
	days.selectByValue("10");
	Select yeardowns=new Select(year);
	yeardowns.selectByValue("1991");
  
	screem("face.png");

	WebElement Fml =driver.findElement(By.id("u_0_9"));
	Fml.click();
	driver.findElement(By.name("websubmit")).click();
	
		screem("login.png");
		Actions action= new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		driver.findElement(By.id("userNavigationLabel")).click();
		Actions action2= new Actions(driver);
		
	    WebElement LogOut = driver.findElement(By.xpath("//span[@class='_54nh'][8]"));
	    action2.moveToElement(LogOut).click().build().perform();
	}
	*/
   
	driver.findElement(By.name("email")).sendKeys("khettabdila8@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("123456Dila");
	driver.findElement(By.id("u_0_2")).click();
	
	
	Actions action= new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	
	driver.findElement(By.id("userNavigationLabel")).click();
	Actions action2= new Actions(driver);
	
    WebElement LogOut = driver.findElement(By.xpath("//span[@class='_54nh'][8]"));
    action2.moveToElement(LogOut).click().build().perform();
}
	public void email(String n) {
		// TODO Auto-generated method stub
		
	}
	public void pass(String s) {
		// TODO Auto-generated method stub
		
	}
	public void login() {
		// TODO Auto-generated method stub
		
	}
	}

	
