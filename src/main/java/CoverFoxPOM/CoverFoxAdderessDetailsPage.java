package CoverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAdderessDetailsPage 
{
	@FindBy(className = "mp-input-text") private WebElement pinCodeField;
	@FindBy(id = "want-expert") private WebElement mobNumField;
	@FindBy(xpath = "//div[text()='Continue']") private  WebElement continueButton;
	
	@FindBy(xpath = "//div[contains(text(),' valid pincode')]") private WebElement pinCodeErrorMsg;
	
	
//	public void CoverFoxAddressDetailsPage(WebDriver driver)
//	{
//	PageFactory.initElements(driver, this);
//	}
	
   public CoverFoxAdderessDetailsPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
	
	public void enterPinCode(String pincode)
	{
	pinCodeField.sendKeys(pincode);
	}
	public void enterMobNum(String mobNum)
	{
		
	mobNumField.sendKeys(mobNum);
	
    }
	public void clickOnContinueButton()
	{
	continueButton.click();
	}
	
	}
   
