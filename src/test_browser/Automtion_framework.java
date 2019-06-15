package test_browser;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automtion_framework {
 public static WebDriver driver=null ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Test Automation\\jar\\chromedriver.exe");
		String url ="https://www.facebook.com/";
		driver =new ChromeDriver();
		driver.get(url);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is after");
	}

	@Before
	public void setUp() throws Exception {
		Thread.sleep(8000);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after method");
		
	}

	@Test
	public void test() {
   System.out.println("this is your test1");
   Home_page execute=new Home_page(driver);
   execute.enteringtheemail("khettabdila8@gmail.com");
   execute.password("dila123456");
   execute.clickbutton();
	}
   @Test
   public void test2() {
	   System.out.println("this is execution of test2");
	   
   }
   
	}
	


