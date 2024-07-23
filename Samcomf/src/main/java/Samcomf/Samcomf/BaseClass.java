package Samcomf.Samcomf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	public static WebDriver driver;
	
	 public void  OpenBrowser()
	    {
	    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\satish.netke\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.get("https://dev.samcomf.com/investor/login");

}
	 }
