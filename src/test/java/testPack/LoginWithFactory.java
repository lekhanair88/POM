package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import browserPack.UtilityClass;
import javaPack.PagesWithFactory;

public class LoginWithFactory {
	@Test
	public void checkValidUser() {
		WebDriver driver = UtilityClass.startBrowser("firefox", "http://newtours.demoaut.com/");
		// this will create a page object of loginpageNew class and return the object.

		PagesWithFactory login = PageFactory.initElements(driver, PagesWithFactory.class);
		login.login_new("tutorial", "tutorial");
	}

}
