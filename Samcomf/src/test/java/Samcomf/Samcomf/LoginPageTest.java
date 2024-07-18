package Samcomf.Samcomf;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  Pages.LoginPage LoginPage;
  WebDriver driver;
  
  @BeforeMethod
public void setup()
{
	LoginPage = new Pages.LoginPage(driver);
	OpenBrowser();	
}
  
@Test
  public void UserEnteringPAN()
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