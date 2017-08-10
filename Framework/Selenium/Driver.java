package Selenium;

import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

	public static WebDriver Instance;
	
	public static DateTimeFormatter tsp = DateTimeFormatter.ofPattern("MM-dd-yy hh:mma");
	public static String setDateTime = tsp.format(java.time.LocalDateTime.now());
	
	public static WebDriver Initialize()
	{
		
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver_win32/chromedriver.exe");	
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		
		Instance = new ChromeDriver(options);
		Instance.manage().window().maximize();
		Instance.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		return Instance;
		
	}																																																								/*kaeyoh*/
}
