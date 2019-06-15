package test_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public static WebDriver driver=null;
	@FindBy(id="email")
	private WebElement emailid;
	
	@FindBy(id="pass")
	 private WebElement passwordfield;
	
	@FindBy(id="u_0_2")
	 private WebElement loginbutton;
	
	@FindBy(id="u_0_j")
	private WebElement cellno;
	
	@FindBy(linkText="Forgot account?") 
	private WebElement forgotlink;
	
	 
	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enteringtheemail(String email) {
    emailid.sendKeys(email);	
	}
    
	public void password(String password) {
		passwordfield.sendKeys(password);
	}
		
		public void cellenetered(String cell) {
			cellno.sendKeys(cell);
		}
		public void forgotlink() {
			forgotlink.click();
		}
	
	public void clickbutton() {
		loginbutton.click();
	
	}
	public void openbrowsersite() {
		System.setProperty("webdriver.chrome.driver","C:\\Test Automation\\jar\\chromedriver.exe");
		String url ="https://www.facebook.com/";
		driver =new ChromeDriver();
		driver.get(url);
	}
	}
	
