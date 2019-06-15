package test_browser;

import org.testng.annotations.Test;
import com.beust.jcommander.Parameters;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest_pass {
  static WebDriver driver= null;

	@Test
	//@Parameters({"search"})
	
	public static void f(String search) throws  InterruptedException {
		
		Home_page home=new Home_page(driver);
		passwd_session password=new passwd_session(driver);
		home.forgotlink();
		password.searchfielements(search);
	
		Thread.sleep(1000);
		password.searchbuttonclick(); 
	}
	
	@BeforeClass
	
	public void beforClass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		   driver=new ChromeDriver();
		   String url="http://facbook.com";
		   driver.get(url);
		
	}

}
