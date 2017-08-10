package Navigation;

import Utilities.ExtentReport;
import Utilities.Region;
import Utilities.Region.GoTo;

public class Navigate {

	public static class PageN
	{
		public static void GLOBAL_EN() throws Exception
		{
		
			ExtentReport.title("Verify Global Banners");
			
			Region.Sites.GLOBAL_EN(GoTo.Home);
			
		}
		public static void US() throws Exception
		{
		
			ExtentReport.title("Verify US Banners");
			
			Region.Sites.US(GoTo.Home);
		}
		
		public static void LA_ES() throws Exception
		{
			ExtentReport.title("Verify LA_ES Banners");
			
			Region.Sites.LA_ES(GoTo.Home);
		}
		
		public static void LA_PT_BR() throws Exception
		{
			ExtentReport.title("Verify LA_PT_BR Banners");
			
			Region.Sites.LA_PT_BR(GoTo.Home);
		}
		
		public static void CN() throws Exception
		{
			ExtentReport.title("Verify CN Banners");
			
			Region.Sites.CN(GoTo.Home);
		}
		
		public static void HK() throws Exception
		{
			ExtentReport.title("Verify HK Banners");
			
			Region.Sites.HK(GoTo.Home);
		}
		
		public static void JP() throws Exception
		{
			ExtentReport.title("Verify JP Banners");
			
			Region.Sites.JP(GoTo.Home);
		}
		
		public static void KR() throws Exception
		{
			ExtentReport.title("Verify KR Banners");
			
			Region.Sites.KR(GoTo.Home);
		}
		
		public static void TW() throws Exception
		{
			ExtentReport.title("Verify TW Banners");
			
			Region.Sites.TW(GoTo.Home);
			Region.Sites.TW(GoTo.Gallery);
		}
		
		public static void TH() throws Exception
		{
			ExtentReport.title("Verify TH Banners");
			
			Region.Sites.TH(GoTo.Home);
		}
		
		public static void EU_EN() throws Exception
		{
			ExtentReport.title("Verify EU_EN Banners");
			
			Region.Sites.EU_EN(GoTo.Home);
		}
		
		public static void EU_FR() throws Exception
		{
			ExtentReport.title("Verify EU_FR Banners");
			
			Region.Sites.EU_FR(GoTo.Home);
		}
		
		public static void EU_DE() throws Exception
		{
			ExtentReport.title("Verify EU_DE Banners");
			
			Region.Sites.EU_DE(GoTo.Home);
		}
		
		public static void EU_NL() throws Exception
		{
			ExtentReport.title("Verify EU_NL Banners");
			
			Region.Sites.EU_NL(GoTo.Home);
		}
		
		public static void EU_ES() throws Exception
		{
			ExtentReport.title("Verify EU_ES Banners");
			
			Region.Sites.EU_ES(GoTo.Home);
		}
		
		public static void EU_IT() throws Exception
		{
			ExtentReport.title("Verify EU_IT Banners");
			
			Region.Sites.EU_IT(GoTo.Home);
		}
		
		public static void EU_RU() throws Exception
		{
			ExtentReport.title("Verify EU_RU Banners");
			
			Region.Sites.EU_RU(GoTo.Home);
		}
		
		public static void EU_PT() throws Exception
		{
			ExtentReport.title("Verify EU_PT Banners");
			
			Region.Sites.EU_PT(GoTo.Home);
		}
		
	}
	
}
