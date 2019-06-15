package test_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoguru9 {
	public static WebDriver driver=null;
	
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.get( "http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	   openUrl();
		
	}
	
	
		public  void  openUrl(){
		
			driver.get( "http://www.demo.guru99.com/V4/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			
			}

		public static void main(String[] args) {
			
			demoguru9 excute =new demoguru9();
			excute.launchChrome();
			
			
			
		}
			}
			
			
				
			
	
		

