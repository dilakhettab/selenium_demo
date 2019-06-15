package test_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_Class {
	 public static WebDriver driver;
	public static <dropdowen> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.skyscanner.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"flights-search-controls-root\"]/div/div/form/div[2]/div[2]/div/div[1]/label")).click();
		Thread.sleep(3000);
		
		String ExpMonth = "August2019";
		 String CurrMonth = driver.findElement(By.id("depart-calendar__bpk_calendar_nav_select")).getText();
		 
		 if (ExpMonth.equals(CurrMonth)) {
			 System.out.println("the month is already selected");
		
		 }else {
			 for (int i= 1 ; i<12 ; i++) {
		 
			 }
		 }
 driver.findElement(By.xpath("//button[@id='depart-calendar__bpk_calendar_nav_"
 		+ "month_nudger_next']//*[@class='BpkCalendarNav_bpk-calendar-nav__icon__2zmfw']")).click();
 dropdowen month= new dropdowen();
 
		 
 
 Thread.sleep(1000);
 CurrMonth = driver.findElement(By.id("depart-calendar__bpk_calendar_nav_select")).getText();
    if (ExpMonth.equals(CurrMonth)) {
    }else {
		 for (int i= 1 ; i<12 ; i++) {
	 break;
		 }
	 System.out.println("month selected");
  
 }
  
	}
    }  
	
	
	

