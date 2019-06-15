package test_browser;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

@Test
public class NewTest_scripte {
	WebDriver driver;
  public void f() throws InterruptedException {
	  Home_page execution = new Home_page(driver);
	  execution.enteringtheemail("khettabdila8@gmail.com");
	  execution.password("123456Dil");
	  execution.cellenetered("202456369");
	  Thread.sleep(6000);
	  //execution.clickbutton();
	  //boolean button= driver.findElement(By.id("u_0_2")).isSelected();
	  //System.out.println(button);
	  //Assert.assertTrue(driver.findElement(By.id("u_0_2")).isSelected());
	  SoftAssert cheks = new SoftAssert();
	  cheks.assertTrue(driver.findElement(By.id("u_0_2")).isSelected());	  
	  }
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Test Automation\\jar\\chromedriver.exe");
		String url ="https://www.facebook.com/";
		driver =new ChromeDriver();
		driver.get(url);
  }

}
