package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utility 
{
   public static String readDataFromExcel(int raw,int cell) throws EncryptedDocumentException, IOException
   {
	   Reporter.log("Reading data from excel sheet", true);
	   FileInputStream myfile=new FileInputStream("C:\\Users\\Dipti chitale\\Documents\\Book2.xlsx");
	   
	  Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	  String data = mysheet.getRow(raw).getCell(cell).getStringCellValue();
	  return data;
   }
    public static void takescreenshot(WebDriver driver,String TCID) throws IOException
    {
    	Reporter.log("TakesScreenshot", true);
    	String timpStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0));
    	
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	File dest= new File("C:\\Selenium\\screenshot\\coverfox"+TCID+"_"+timpStamp+ ".png");
    	Reporter.log("Saved screenshot at"+dest,true);
    	org.openqa.selenium.io.FileHandler.copy(src, dest);
    }
}
