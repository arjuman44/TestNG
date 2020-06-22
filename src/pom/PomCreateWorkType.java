package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomCreateWorkType {
	
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofWorkLink;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createTypeofWorkButton;
	
	@FindBy(id="name")
	private WebElement nameTextField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createWorkSubmitButton;
	
	//@FindBy(xpath="(//a[.='Software6']/../..//td[@class='listtblcell lastInRow']")
	@FindBy(xpath="(//a[.='Software60']/../..//td)[9]")
	private WebElement deleteWorkTypeLink;
	
	
	public PomCreateWorkType(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void CreateWorkType() throws InterruptedException
	
	{
		Thread.sleep(2000);
		settingsLink.click();
		typesofWorkLink.click();
		createTypeofWorkButton.click();
		nameTextField.sendKeys("Software30");
		Thread.sleep(2000);
		createWorkSubmitButton.click();
		
	}
	
	public void DeleteworkType() throws InterruptedException
	{
		Thread.sleep(2000);
		settingsLink.click();
		typesofWorkLink.click();
		createTypeofWorkButton.click();
		nameTextField.sendKeys("Software60");
		Thread.sleep(2000);
		createWorkSubmitButton.click();
		deleteWorkTypeLink.click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		alt.accept();
	}

}
