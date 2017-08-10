package TestUtilities;

import java.io.IOException;

//import javax.mail.MessagingException;
//import javax.mail.internet.AddressException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Selenium.Driver;
import Utilities.ExtentReport;


public class XYZBannerTest 
{

		@BeforeClass
		public static void init()
		{
			Driver.Initialize();
			
			ExtentReport.start();
			
		}
		
		
		@AfterClass
		public static void close() throws IOException
		{
			
			ExtentReport.openReport();
			
			
		}
		

}
