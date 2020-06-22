package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomCreateLeaveType {
	
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leaveTypesLink;
	
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement createLeaveTypeButton;
	
	
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement createNewLeaveTextfield;
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement createLeaveSubmitButton;
	
	@FindBy(xpath="//span[.='sick11']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement leaveTypeDeleteIcon;
	
	
	
	public PomCreateLeaveType(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createLeavetypeMethod() throws InterruptedException
	{
		Thread.sleep(1000);
		settingsLink.click();
		leaveTypesLink.click();
		createLeaveTypeButton.click();
		createNewLeaveTextfield.sendKeys("sickLeave17");
		Thread.sleep(3000);
		createLeaveSubmitButton.click();
		
		
		
	}
	
	public void DeleteLeaveType() throws InterruptedException
	{
		Thread.sleep(1000);
		settingsLink.click();
		leaveTypesLink.click();
		createLeaveTypeButton.click();
		createNewLeaveTextfield.sendKeys("sick11");
		Thread.sleep(3000);
		createLeaveSubmitButton.click();
		Thread.sleep(2000);
		leaveTypeDeleteIcon.click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		alt.accept();
	}

}
