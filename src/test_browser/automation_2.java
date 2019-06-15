package test_browser;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation_2 {
public static WebDriver driver=null ;
	

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
   /*System.out.println("this is your test1");
   driver.findElement(By.id("email")).sendKeys("Automation");
   driver.findElement(By.id("pass")).sendKeys("tester");
   driver.findElement(By.id("u_0_2")).click();*/
	}
//   @Test
//   public void test2() {
//	   System.out.println("this is execution of test2");
//	   
//   }
   

}
