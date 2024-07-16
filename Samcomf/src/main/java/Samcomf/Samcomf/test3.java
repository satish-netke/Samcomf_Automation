package Samcomf.Samcomf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 
{
	 public static void main( String[] args ) throws InterruptedException
	    {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\satish.netke\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	    	WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.get("https://dev.samcomf.com/");
	    	driver.findElement(By.xpath("//a[@href=\"https://dev.samcomf.com/investor/login\"]")).click();  
	    	driver.findElement(By.xpath("//input[@id=\"enterPan\"]")).sendKeys("BCPPN3680K");
	    	driver.findElement(By.xpath("//a[@id=\"checkLoginBtn\"]")).click();
	    
	    }
}
