package Samcomf.Samcomf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 
{
	 public static void main( String[] args ) throws InterruptedException
	    {
//	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\satish.netke\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	    	WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.get("https://www.samcomf.com/investor/login");
	    	//driver.findElement(By.linkText("Conditions of Use")).click();
	    	//driver.findElement(By.xpath("//a[@href=\"https://dev.samcomf.com/investor/login\"]")).click();  
	    	driver.findElement(By.xpath("//input[@id=\"enterPan\"]")).sendKeys("BCPPN3680K");
	    	driver.findElement(By.xpath("//a[@id=\"checkLoginBtn\"]")).click();
	    	Thread.sleep(4000);
	    	
//	        WebDriverWait wait = new WebDriverWait(driver, 15); // 15 seconds timeout
//	        WebElement firstDigitInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));

	    	WebElement firstDigitInput = driver.findElement(By.xpath("(//input[@type='password'])"));
	    	WebElement secondDigitInput =  driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	    	WebElement thirdDigitInput = driver.findElement(By.xpath("(//input[@type='password'])[3]"));
	    	WebElement fourthDigitInput = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
	        
//	        WebElement secondDigitInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='password'])[2]")));
//	        WebElement thirdDigitInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='password'])[3]")));
//	        WebElement fourthDigitInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='password'])[4]")));

	        firstDigitInput.sendKeys("1");
	        secondDigitInput.sendKeys("2");
	        thirdDigitInput.sendKeys("1");
	        fourthDigitInput.sendKeys("2");

	        
	        
	    	driver.findElement(By.xpath("//div[@class=\"input-area pin-box text-center jpa\"]"));
	    	
	    	driver.findElement(By.xpath("//a[@id=\"sendotpforpin\"]")).click(); 
	    	
	    	System.err.println("Pin Entered Succesffully");
	    }
	}
