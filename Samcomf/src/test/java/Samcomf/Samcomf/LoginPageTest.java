package Samcomf.Samcomf;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends Samcomf.Samcomf.BaseClass
{
  Pages.LoginPage loginPage;
  
  @BeforeMethod
public void setup()
{
	loginPage = new Pages.LoginPage(driver);
	OpenBrowser();	
}
  
  @Test
  public void userEnteringPAN() throws InterruptedException
  {
	  loginPage.enterPan("BCPPN3680K");
	  loginPage.continueButton();
  }

  @AfterMethod
public void teardown() throws InterruptedException
{		
	  Thread.sleep(1500);
      driver.close();	
}

}