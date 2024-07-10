package commonFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {
//define Repository
	@FindBy(id="btnreset")
	WebElement objResetBtn;
	@FindBy(xpath = "//input[@id='username']")
	WebElement objUser;
	@FindBy(id="password")
	WebElement objpass;
	@FindBy(id="btnsubmit")
	WebElement objLoginbtn;
	//method for login
	 public void adminLogin(String user,String pas, CharSequence pass)
	 {
		 objResetBtn.click();
		 objUser.sendKeys(user);
		 objpass.sendKeys(pass);
		 objLoginbtn.click();
		
		
	 }
}
