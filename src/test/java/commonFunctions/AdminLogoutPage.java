package commonFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogoutPage {

	@FindBy(xpath = "//a[@id='logout']")
	WebElement objLogout;
	public void AdmineLogout()
	{
		objLogout.click();
		
	}
}

