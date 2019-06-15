package test_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class passwd_session {
WebDriver driver;

@FindBy(id="identify_email")
WebElement searchfied;
@FindBy(name="did_submit")
WebElement searchbut;
@FindBy(xpath="//spand[@class='uiButtonText']")
WebElement cancelbut;
 
  public passwd_session(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
	  }
 public void searchbuttonclick() {
	 searchbut.click();
	 }
public void searchfielements(String Chare) {
	searchfied.sendKeys(Chare);
	
	}
	public void cancelbuttonclick() {
		cancelbut.click();
		
	}
	
}
