package TestBanners;


import org.testng.annotations.Test;

import Navigation.Navigate;
import TestUtilities.XYZBannerTest;


public class Sites extends XYZBannerTest
{
	@Test
	public static void A_Asia() throws Exception
	{
		Navigate.PageN.TW();
		Navigate.PageN.CN();
		Navigate.PageN.HK();
		Navigate.PageN.KR();
		Navigate.PageN.TH();
		Navigate.PageN.JP();
	}	
	
	@Test
	public static void B_Global() throws Exception
	{
		Navigate.PageN.GLOBAL_EN();
	}
	@Test
	public static void C_Europe() throws Exception
	{
		Navigate.PageN.EU_EN();
		Navigate.PageN.EU_FR();
		Navigate.PageN.EU_DE();
		Navigate.PageN.EU_NL();
		Navigate.PageN.EU_ES();
		Navigate.PageN.EU_IT();
		Navigate.PageN.EU_PT();
		Navigate.PageN.EU_RU();
	}	
	
	@Test
	public static void D_Americas() throws Exception
	{
		Navigate.PageN.LA_ES();
		Navigate.PageN.LA_PT_BR();
		Navigate.PageN.US();
		
	}	
	
}
