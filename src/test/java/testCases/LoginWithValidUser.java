package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseSetup.Base;
import pages.AuthenticationPage;
import pages.CreateAnAccountPage;
import pages.Home;

public class LoginWithValidUser extends Base{

	
	//1. create a driver variable
	//2.  create the objects for the PageClasses
	//3. pass the driver variable from baseClass
	//4. Initialize the page objects
	//5. create test cases
	
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
	public void testCase1()
	{
		homePage.verifySearchField();
		authPage.goToAuthenticationPage();
		authPage.LoginUser();
		
	}
	
}
