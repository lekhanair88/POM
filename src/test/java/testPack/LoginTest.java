package testPack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import browserPack.UtilityClass;
import javaPack.Pages;
import junit.framework.Assert;

public class LoginTest {
	WebDriver driver;
	@Test
	public void verifyValidLogin()
	{
		driver=UtilityClass.startBrowser("firefox", "http://newtours.demoaut.com/");
		Pages login=new Pages(driver);
		login.do_login("tutorial", "tutorial");
		Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
		System.out.println("Logged in Successfully !!");
					
	}
}
