package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage {

	// Declaration
	@FindBy(id="username")
	private WebElement usernameTextBox;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextBox;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedInBox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTimeLink;
	
	//Initialization
	public PomLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void loginmethod()
	 {
usernameTextBox.sendKeys("admin");
passwordTextBox.sendKeys("manager");
keepmeloggedInBox.click();
loginButton.click();
	 }
	
	public void forgotYourPasswordMethod()
	{
		forgotPasswordLink.click();
	}
	
	public void actitimeLinkMethod()
	{
		actiTimeLink.click();
	}
}

/* Null Pointer Exception:  If the Initialization of the Element is done properly we get Null Pointer Exception
 
 */


