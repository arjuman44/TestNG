package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.PomCreateLeaveType;
import pom.PomLoginPage;

public class TestActitimeLoginAndDeleteLeaveType {
	
	@Test(groups="Smoke")
	public void deleteLeaveType() throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver 6");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com");

	PomLoginPage login = new PomLoginPage(driver);
	login.loginmethod();
	
	PomCreateLeaveType leave = new PomCreateLeaveType(driver);
	leave.DeleteLeaveType();
	
	
	}
	
}
