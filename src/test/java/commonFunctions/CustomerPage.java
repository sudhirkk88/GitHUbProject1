package commonFunctions;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerPage {
private static final String objphonenumber = null;
WebDriver driver;
public CustomerPage(WebDriver driver)
{
	this.driver=driver;
}
// define Repository
@FindBy(xpath ="(//a[contains(text(),'Customers')])[2]")
WebElement objcustomerLink;
@FindBy(xpath = "(//span[@data-caption='Add'])[1]")
WebElement objClickAddicon;
@FindBy(name = "x_Customer_Number")
WebElement objcustomerNumber;
@FindBy(name = "x_Customer_Name")
WebElement objcustomerName;
@FindBy(name = "x_Address")
WebElement objAddress;
@FindBy(name = "x_City")
WebElement objcity;
@FindBy(name = "x_Country")
WebElement objcountry;
@FindBy(name = "x_Contact_Person")
WebElement objcontactperson;
@FindBy(name = "x_Phone_Number")
WebElement objphoneNumber;
@FindBy(name = "x__Email")
WebElement objemail;
@FindBy(name = "x_Mobile_Number")
WebElement objMobileNumber;
@FindBy(name = "x_Notes")
WebElement objNotes;
@FindBy(id="btnAction")
WebElement objClickAddBtn;
@FindBy(xpath ="//button[normalize-space()='OK!']")
WebElement objClickConfirmok;
@FindBy(xpath ="(//button[starts-with(text(),'OK')])[6]")
WebElement objClickAlertok;
@FindBy(xpath = "//button[@data-caption='Search Panel']")
WebElement objserchpanel;
@FindBy(xpath = "//input[@id='psearch']")
WebElement objserchTextbox;
@FindBy(xpath = "//button[@id='btnsubmit']")
WebElement objserchBtn;
@FindBy(xpath = "//table[@class='table ewTable']/tbody/tr[1]/td[5]/div/span/span")
WebElement webtable;

//method for add customer
public Boolean addCustomer(String Cname,String Address,String city,String Country,String Cperson,String pnumber,String Email,String Mnumber,String notes)throws Throwable
{
	Actions ac = new Actions(driver);
	ac.moveToElement(this.objcustomerLink).click().perform();
	ac.pause(400000);
	ac.moveToElement(this.objClickAddicon).click().perform();
	String Exp_Data = this.objcustomerNumber.getAttribute("value");
			this.objcustomerName.sendKeys(Cname);
	this.objAddress.sendKeys(Address);
	this.objcity.sendKeys(city);
	this.objcountry.sendKeys(Country);
	this.objcontactperson.sendKeys(Cperson);
	this.objphoneNumber.sendKeys(pnumber);
	this.objemail.sendKeys(Email);
	this.objMobileNumber.sendKeys(Mnumber);
	this.objNotes.sendKeys(notes);
	ac.moveToElement(this.objClickAddBtn).click().perform();
	ac.pause(1000);
	ac.moveToElement(this.objClickConfirmok).click().perform();
	ac.pause(2000);
	ac.moveToElement(this.objClickAlertok).click().perform();	
	if(!objserchTextbox.isDisplayed())
		objserchpanel.click();
	objserchTextbox.clear();
	objserchTextbox.sendKeys(Exp_Data);
	objserchBtn.click();
	String Act_data = webtable.getText();
	if(Act_data.equals(Exp_Data))
	{
		Reporter.log(Exp_Data+"   "+Act_data,true);
		return true;
		
	}
	else
	{
		
		Reporter.log(Exp_Data+"   "+Act_data,true);
		return false;
		
	}
	
	
	
	
}


}
