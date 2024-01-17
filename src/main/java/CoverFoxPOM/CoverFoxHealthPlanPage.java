package CoverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanPage  
{
   @FindBy(xpath="//div[@class='next-btn']")private WebElement nextButten;
   public CoverFoxHealthPlanPage(WebDriver driver) 
   {
	//   PageFactory.initElements(driver, this);
	   PageFactory.initElements(driver, this);
   }
    public void clickOnNextButton()
    {
    	nextButten.click();
    }
}
