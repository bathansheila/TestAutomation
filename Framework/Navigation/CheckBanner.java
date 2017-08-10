package Navigation;


import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import Selenium.Driver;
import Utilities.ExtentReport;

public class CheckBanner {
	

public static String VerifyAt;
public static int subAvailable;
public static int subMissing;
public static int subReq;
public static String url;
	

	public static void thisPage(String link)
	{
		Driver.Instance.get(link);
		
		url = link;
		
	}
	
	public static String Page(String page)
	{
		return VerifyAt;
	}

	public static class Index
	{
		public static void execute(CheckFor banner) throws Exception
		{
			//WebDriverWait wait = new WebDriverWait(Driver.Instance, 20);
				
			switch(banner)
				{
				
					case Primary:
						VerifyAt ="Primary Banner";
						
					//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.banner-img-item.item.banner_ie.lg-col-12.md-col-12.sm-col-12.mb-col-12.top.ht600.ng-scope")));
						
						if(Driver.Instance.findElements( By.cssSelector("div.banner-img-item.item.banner_ie.lg-col-12.md-col-12.sm-col-12.mb-col-12.top.ht600.ng-scope")).size() != 0)
						{
							ExtentReport.IlogBannerAvailable();
							
						}
						else
						{	
							ExtentReport.IlogBannerUnavailable();
							
						}
						
							ExtentReport.screenshots();
							ExtentReport.tear();
						
						break;
					
					case Sub:
						VerifyAt ="Sub Banner";
						
						//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.sub-banner-item")));
						
						int reqBanner = 4;
						int subCount = Driver.Instance.findElements(By.cssSelector("a.sub-banner-item")).size();
						System.out.println("Available: " + subCount);
						
						//missing
						int subAv = reqBanner-subCount;
						System.out.println("Missing:" + subAv);
						
						subAvailable = subCount;
						subMissing = subAv;
						subReq = reqBanner;
						
						
						
						if (subCount == reqBanner)
						{
							
							ExtentReport.logSubCountPass();
													
						}
						
						else
						{
							
							ExtentReport.logSubCountFail();
													
						}
							ExtentReport.screenshots();
							ExtentReport.tear();
							
						break;
					
					case Event:
						VerifyAt ="Event Banner";
						
						//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.event-banner.item.ng-scope")));
						
						if(Driver.Instance.findElements( By.cssSelector("a.event-banner.item.ng-scope")).size() != 0)
						{
							ExtentReport.IlogBannerAvailable();
							
						}
						else
						{	
							ExtentReport.IlogBannerUnavailable();
							
						}
						
							ExtentReport.screenshots();
							ExtentReport.tear();
						
						
						break;
				
			default:;
			
			Page(VerifyAt);
			
			}//switch
		}//execute
	}//index

	public static enum CheckFor
	{	
		Primary, Sub, Event
	}
	
	public static class Gallery
	{
		public static void execute(CheckFor banner) throws Exception
		{
				switch(banner)
			{
				
				case Primary:
				VerifyAt ="Gallery Banner";
				
				
				if(Driver.Instance.findElements( By.cssSelector("div.bg_img")).size() != 0)
				{
					ExtentReport.IlogBannerAvailable();
					
				}
				else
				{	
					ExtentReport.IlogBannerUnavailable();
					
				}
				
				ExtentReport.screenshots();	
				ExtentReport.tear();
				
				break;
				default:;
				
				Page(VerifyAt);
			
			}//switch
		}//execute
	}//gallery
	
	
}

