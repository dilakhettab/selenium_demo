package test_browser;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest_dataProvider {
	public WebDriver driver;
	
	  @Test(dataProvider = "dp")
	  public void f(int n ,int s )  {
		  Home_page provides = new Home_page(driver);
		 /* provides.enteringtheemail(n);
		  provides.password(s);
		  provides.clickbutton();*/
		
		  Select dropdown=new Select(driver.findElement(By.id("month")));
		  dropdown.selectByIndex(n);
		 
		  dropdown.selectByIndex(s);
		  Reporter.log("this is index number"+n,true);
		  Reporter.log("this is index number"+s,true);
	  }
	 
	  @DataProvider()
	  public  Object [][] dp() {
		  
		  return  new Object[][]{
		
			  new Object[] {1 , 2},
			  new Object[] {3 , 4},
			  new Object[] {5 , 6},
			  new Object[] {7 , 8},
			  new Object[] {9 , 10},
			  new Object[] {11 , 12},
		  };
	  }
		  
		  @BeforeClass()
		
			  public void beforeClass() {
			  System.setProperty("webdriver.chrome.driver","C:\\Test Automation\\jar\\chromedriver.exe");
				String url ="https://www.facebook.com/";
				driver =new ChromeDriver();
				driver.get(url);
			  
			  
		  }
		  @AfterClass()
		  public void afterClass() {
			  
			  
			  
		  }
	  }

	  

			 
		  
		  
	 
		 
			  
		  
	

	  