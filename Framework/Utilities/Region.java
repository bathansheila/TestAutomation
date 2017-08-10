package Utilities;

import Navigation.CheckBanner;
import Navigation.CheckBanner.CheckFor;

public class Region {
	
	public static String pageIsAt;
	
	
	public static String Page(String page)
	{
		
		return pageIsAt = page;
		
	}

	public static class Sites
	{

		public static void GLOBAL_EN(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home: 
					pageIsAt ="GLOBAL_EN Home Page";
					CheckBanner.thisPage("http://global.xyzprinting.com/");
					CheckBanner.Index.execute(CheckFor.Sub);
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
			
		}
		public static void US(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="US Home Page";
					CheckBanner.thisPage("http://us.xyzprinting.com/");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
			
		}
		
		public static void LA_ES(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="LA_ES Home Page";
					CheckBanner.thisPage("http://la.xyzprinting.com/la_es/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
			
		}
		
		public static void LA_PT_BR(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="LA_PT_BR Home Page";
					CheckBanner.thisPage("http://la.xyzprinting.com/la_pt_br/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
			
		}
		public static void CN(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="CN Home Page";
					CheckBanner.thisPage("http://www.xyzprinting.cn/");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void HK(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="HK Home Page";
					CheckBanner.thisPage("http://global.xyzprinting.com/global_zh_hk/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void JP(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="JP Home Page";
					CheckBanner.thisPage("https://jp.xyzprinting.com/jp_ja/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void KR(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="KR Home Page";
					CheckBanner.thisPage("http://kr.xyzprinting.com/");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void TW(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="TW Home Page";
					CheckBanner.thisPage("http://tw.xyzprinting.com/");
					CheckBanner.Index.execute(CheckFor.Primary);
					CheckBanner.Index.execute(CheckFor.Sub);
					CheckBanner.Index.execute(CheckFor.Event);
					
					break;
				
				case Gallery: 
					pageIsAt ="TW 3D Gallery Page";
					CheckBanner.thisPage("http://tw.gallery.xyzprinting.com/"); 
					CheckBanner.Gallery.execute(CheckFor.Primary);
					
					break;
					
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void TH(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="TH Home Page";
					CheckBanner.thisPage("http://www.xyzprinting.co.th/");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void EU_EN(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="EU_EN Home Page";
					CheckBanner.thisPage("http://eu.xyzprinting.com/eu_en/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void EU_FR(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="EU_FR Home Page";
					CheckBanner.thisPage("http://eu.xyzprinting.com/eu_fr/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void EU_DE(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="EU_DE Home Page";
					CheckBanner.thisPage("http://eu.xyzprinting.com/eu_de/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void EU_NL(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="EU_NL Home Page";
					CheckBanner.thisPage("http://eu.xyzprinting.com/eu_nl/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void EU_ES(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="EU_ES Home Page";
					CheckBanner.thisPage("http://eu.xyzprinting.com/eu_es/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void EU_IT(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="EU_IT Home Page";
					CheckBanner.thisPage("http://eu.xyzprinting.com/eu_it/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void EU_RU(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="EU_RU Home Page";
					CheckBanner.thisPage("http://eu.xyzprinting.com/eu_ru/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
		public static void EU_PT(GoTo page) throws Exception
		{
			switch(page)
			{
				
				case Home:
					pageIsAt ="EU_PT Home Page";
					CheckBanner.thisPage("http://eu.xyzprinting.com/eu_pt/Home");
					CheckBanner.Index.execute(CheckFor.Sub);
					
					break;
					
				default:;
				
				Page(pageIsAt);
				
			}
		}
	}
	public static enum GoTo
	{
		Home , Gallery
		
	}
	

}
