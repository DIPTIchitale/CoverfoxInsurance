package listners;





import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import CoverfoxBASE.Base;
import coverFoxUtility.Utility;

public class ListnerCoverfox  extends Base implements  ITestListener
{


@Override
   public void onTestFailure(ITestResult result)
   {
	 try {
		WebDriver driver = null;
		Utility.takescreenshot(driver,result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
	public void onTestSuccess(ITestResult result) 
   {
		
   }
   @Override
	public void onTestSkipped(ITestResult result)
   {
		
   }
   
  
}

