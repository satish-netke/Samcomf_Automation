package Samcomf.Samcomf;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends Samcomf.Samcomf.BaseClass
{
  Pages.LoginPage LoginPage;
  
  @BeforeMethod
public void setup()
{
	LoginPage = new Pages.LoginPage(driver);
	OpenBrowser();	
}
  
@Test
  public void UserEnteringPAN() throws InterruptedException
  {
	  LoginPage.enterPan("BCPPN3680K");
	  LoginPage.ContinueButton();
  }

@AfterMethod
public void teardown()
{
     driver.close();	
}

}