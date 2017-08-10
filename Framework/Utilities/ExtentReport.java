package Utilities;

import java.awt.Desktop;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;





import javax.imageio.ImageIO;

import org.openqa.selenium.TakesScreenshot;



//import org.apache.bcel.verifier.exc.Utility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
//import org.testng.ITestResult;






import Navigation.CheckBanner;
import Selenium.Driver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReport {
	 	
	private static ExtentReports extent; 
	private static ExtentTest report;
	

	public static ExtentReports Instance()
	{
			
		ExtentReports extent;
		String Path = "./ExtentReport.html";
		System.out.println(Path);
		extent = new ExtentReports(Path, true);

		return extent;
			
	}
	
	public static void start()
	{
		extent = Instance();
	
	}
	
	public static void title(String title)
	{
		report = extent.startTest(title);
		report.assignAuthor("Testing Team");
	}
	
	public static ExtentTest IlogBannerAvailable()
	{
		report.log(LogStatus.PASS, "Verify if "+CheckBanner.VerifyAt+ " exists.", "Banner is AVAILABLE");
		return report;	
	}
	public static ExtentTest IlogBannerUnavailable()
	{
		report.log(LogStatus.FAIL, "Verify if "+CheckBanner.VerifyAt+ " exists.", "Banner is UNAVAILABLE");
		return report;	
	}
	
	public static ExtentTest logSubCountPass()
	{
		report.log(LogStatus.PASS, "Verify if "+CheckBanner.VerifyAt+ " exists.", CheckBanner.subAvailable+" Available | " + CheckBanner.subMissing+" Missing");
		return report;	
	}
	public static ExtentTest logSubCountFail()
	{
		report.log(LogStatus.FAIL, "Verify if "+CheckBanner.VerifyAt+ " exists.", CheckBanner.subAvailable+" Available | " + CheckBanner.subMissing+" Missing");
		return report;	
	}
	
	
	public static ExtentTest screenshots()
	{
		try {
			generateScreenshot();
			System.out.println("Screenshot was saved!");
		} catch (Exception e) {
			
			System.out.println("No Screenshot found!");
		}
		report.log(LogStatus.INFO, "Screenshot: "+report.addScreenCapture("C:\\Users\\pb6n0070\\Documents\\TestAutomation\\screenshots\\"+Region.pageIsAt.replaceAll("[^\\w\\s]"," ")+".png"));
		return report;
		
	}
	public static void generateScreenshot() throws IOException
	{
		
		WebDriver augmentedDriver = new Augmenter().augment(Driver.Instance);
		File scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		BufferedImage  fullImg = ImageIO.read(scrFile);
		
		
		FileUtils.copyFile(scrFile, new File("C:\\Users\\pb6n0070\\Documents\\TestAutomation\\screenshots\\"+Region.pageIsAt.replaceAll("[^\\w\\s]"," ")+".png"));
	
		 
		
	}
	public static void tear()
	{	
		
		extent.endTest(report);
		extent.flush();
	}
		
	public static void openReport() throws IOException
	{
		File htmlFile = new File("C:/Users/pb6n0070/Documents/TestAutomation/ExtentReport.html");
		Desktop.getDesktop().browse(htmlFile.toURI());
	}
																																																												/*kaeyoh*/
}

