package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseSetup.Base;
import pages.AuthenticationPage;
import pages.CreateAnAccountPage;
import pages.Home;

public class LoginWithInvalidUser extends Base {

private WebDriver driver;
	
	AuthenticationPage authPage=null;
	CreateAnAccountPage createNewAcc=null;
	Home homePage=null;
	
	@BeforeSuite
	public void initialSetup()
	{
		driver = getDriver();
		authPage= new AuthenticationPage(driver);
		createNewAcc= new CreateAnAccountPage(driver);
		homePage= new Home(driver);
	}
	
	@Test
	public void testCase3()
	{
		homePage.verifySearchField();
		authPage.goToAuthenticationPage();
		createNewAcc.randomEmail();
		createNewAcc.InvalidFillForm();
	}
	
}
