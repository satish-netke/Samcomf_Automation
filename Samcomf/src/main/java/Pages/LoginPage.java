package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Samcomf.Samcomf.BaseClass;

public class LoginPage  extends BaseClass
{

    @FindBy(id = "enterPan") private WebElement UserPan;
    @FindBy(id = "checkLoginBtn") private WebElement ContinueButton;
    @FindBy(linkText = "Conditions of Use") private WebElement ConditionsofUse;
    @FindBy(linkText = "Privacy Policy") private WebElement PrivacyPolicy;
    @FindBy(xpath = "//img[@alt ='Samco Mutual Fund']") private WebElement SamcoLogo;

  
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
		
	public void enterPan (String PAN)
	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOf(UserPan));

		UserPan.sendKeys(PAN);
	}
	public void ContinueButton()
	{
		ContinueButton.click();
	}
	
	public void ConditionsofUse()
	{
		ConditionsofUse.click();
	}
	public void PrivacyPolicy()
	{
		PrivacyPolicy.click();
	}
	public void SamcoLogo()
	{
		SamcoLogo.click();
	}
}
//a[Text()='Conditions of Use']
