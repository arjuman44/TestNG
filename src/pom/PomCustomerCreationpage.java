package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomCustomerCreationpage {

	public WebDriver driver;

	@FindBy(id="container_tasks")
	private WebElement taskLink;

	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;

	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomerLink;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerNameTextfield;

	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerButton;

	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;


	public PomCustomerCreationpage(WebDriver driver)
	{
		this.driver=driver;  // WE get Null Pointer Exception if we don't point the driver in this method, 
		PageFactory.initElements(driver, this);
	}

	public void createCustomerMethod() throws InterruptedException
	{

		taskLink.click();
		addNewButton.click();
		newCustomerLink.click();
		enterCustomerNameTextfield.sendKeys("Arjumanf30");
		
		//createCustomerButton.click();

	}

	public void cancelCustomeMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		cancelButton.click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		alt.accept();
	}
}


/* since we have globally declared the webdriver referece varialble, selenium is in ambiguity to which driver it should point for either for global one or cancel one? 
 * hence we use this.driver = driver */
