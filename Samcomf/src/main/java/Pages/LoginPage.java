package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Samcomf.Samcomf.BaseClass;

public class LoginPage 
{
    @FindBy(xpath = "//input[@id='enterPan']") private WebElement userPan;
    @FindBy(id = "checkLoginBtn") private WebElement continueButton;
    
//    @FindBy(linkText = "Conditions of Use") private WebElement ConditionsofUse;
//    @FindBy(linkText = "Privacy Policy") private WebElement PrivacyPolicy;
//    @FindBy(xpath = "//img[@alt ='Samco Mutual Fund']") private WebElement SamcoLogo;
   

 
	public LoginPage(WebDriver driver) 
	{
      PageFactory.initElements(driver, this);
	}
		
	public void enterPan(String PAN) throws InterruptedException
	{
		//Thread.sleep(1500);
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("enterPan")));
		
	    userPan.sendKeys(PAN);
	}
	public void continueButton()
	{
		continueButton.click();
	}
	
//	public void ConditionsofUse()
//	{
//		ConditionsofUse.click();
//	}
//	public void PrivacyPolicy()
//	{
//		PrivacyPolicy.click();
//	}
//	public void SamcoLogo()
//	{
//		SamcoLogo.click();
//	}
}
//a[Text()='Conditions of Use']
