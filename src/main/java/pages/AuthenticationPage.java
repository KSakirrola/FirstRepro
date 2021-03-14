package pages;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class AuthenticationPage {
	 
			private WebDriver driver;//global variable driver
			
			public AuthenticationPage (WebDriver driver)//parametric constructor
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
	 @FindBy(className = "login")
	 public WebElement signInBtn;
	 
	 @FindBy(id = "email")
	 public WebElement EmailExistingUser;
	 
	 @FindBy (id = "passwd")
	 public WebElement PassExistingUser;
	 
	 @FindBy (id = "SubmitLogin")
	 public WebElement SignInExistingUser;
	 
	 public void goToAuthenticationPage()
	 {
	  signInBtn.click();
	 }
	 
	 public void LoginUser()
	 {
	  EmailExistingUser.sendKeys("qa.keerti@gmail.com");
	  PassExistingUser.sendKeys("qaktest");
	  SignInExistingUser.click();
	  
	 }
}
