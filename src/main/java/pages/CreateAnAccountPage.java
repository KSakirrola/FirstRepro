package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage 
{
 
	private WebDriver driver;//global variable driver
	
	public CreateAnAccountPage (WebDriver driver)//parametric constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
 @FindBy(className = "login")
 public WebElement signInBtn;
 
 @FindBy (id = "email_create")
 public WebElement emailNewAccount;
 
 @FindBy (id = "SubmitCreate")
 public WebElement createAccBtn;
 
 @FindBy (id="uniform-id_gender2")
 public WebElement genderCreateAcc;
 
 @FindBy (id="customer_firstname")
 public WebElement firstNameCreateAcc;
 
 @FindBy (id="customer_lastname")
 public WebElement lastNameCreateAcc;
 
 @FindBy(id="email")
 public WebElement emailCreateAcc;
 
 @FindBy(id="passwd")
 public WebElement PasswdCreateAcc;
 
 @FindBy(id ="days")
 public WebElement dayCreateAcc;
 
 @FindBy(id = "months")
 public WebElement monthCreateAcc;
 
 @FindBy(id ="years")
 public WebElement yearCreateAcc;

@FindBy(id="newsletter")
 public WebElement newsLetterCkbx;
 
 @FindBy(id="optin")
    public WebElement spOfferCkbx;
 
    @FindBy(id="firstname")
 public WebElement firstNameAddrCreateAcc;
 
    @FindBy(id="lastname")
 public WebElement lastNameAddrCreateAcc;
    
 @FindBy(id="company")
 public WebElement CompanyCreateAcc;
 
 @FindBy(id="address1")
 public WebElement AddressCreateAcc;
 
 @FindBy(id="city")
 public WebElement CityCreateAcc;
 
 @FindBy(id="id_state")
 public WebElement StateCreateAcc;
 
 @FindBy(id="postcode")
 public WebElement POCreateAcc;
 
 @FindBy(id="id_country")
 public WebElement CountryCreateAcc;
 
 @FindBy(id="other")
 public WebElement AddInfoCreateAcc;
 
 @FindBy(id="phone")
 public WebElement HphoneCreateAcc;
 
 @FindBy(id="phone_mobile")
 public WebElement MphoneCreateAcc;
 
@FindBy(id="alias")
 public WebElement AliasAddCreateAcc;
 
 @FindBy(id="submitAccount")
 public WebElement RegisterCreateAcc;
 
 
 public void goToAuthenticationPage()
 {
  signInBtn.click();
 }
 
 /*public void enterNewEmailId()
 {
  emailNewAccount.sendKeys("qa.test@test.com");
  createAccBtn.click();
 }*/
 
 public void randomEmail()
 {
  emailNewAccount.click();  
  Random randomGenerator = new Random();  
  int randomInt = randomGenerator.nextInt(10000);
  emailNewAccount.sendKeys("username"+ randomInt +"@gmail.com");   
  createAccBtn.click();
 }
 
 public void CorrectFillForm()
 
 {
  genderCreateAcc.click();
  firstNameCreateAcc.sendKeys("keertitest");
  lastNameCreateAcc.sendKeys("qa");
  //emailCreateAcc.sendKeys("qa.test@test.com");
  PasswdCreateAcc.sendKeys("kertitest");
  
  //Select day from Days Dropdown for DOB
  Select day = new Select(dayCreateAcc);
  day.selectByValue("5");
  
  //Select month from months Dropdown for DOB
  Select month = new Select(monthCreateAcc);
  month.selectByValue("4");
  
  //Select year from year Dropdown for DOB
  Select years = new Select(yearCreateAcc);
  years.selectByValue("2020");
  
  newsLetterCkbx.click();
  firstNameAddrCreateAcc.sendKeys("keertitest");
  lastNameAddrCreateAcc.sendKeys("qa");
  CompanyCreateAcc.sendKeys("Techterrain");
  AddressCreateAcc.sendKeys("ABC Avenue, Florida");
  CityCreateAcc.sendKeys("Tampa");
  
  //Select State from dropdown
  Select state = new Select(StateCreateAcc);
  state.selectByValue("4");
  POCreateAcc.sendKeys("10090");
  
  //Select Country from dropdown
  Select Country = new Select(CountryCreateAcc);
  Country.selectByValue("21");
  
  AddInfoCreateAcc.sendKeys("test");
  HphoneCreateAcc.sendKeys("1212222222");
  MphoneCreateAcc.sendKeys("1111111111");
  AliasAddCreateAcc.sendKeys("test Ave, Global");
  RegisterCreateAcc.click();
 }
  
 

 
/* @FindBy(xpath = "//*[@id=\"center_column\"]/div")
 public WebElement ErrorCreateAcc;
 
 public void ErrorAccCreate()
 {
  System.out.println("Test case Passes as correct error message displays "+ ErrorCreateAcc.getText());
 }
 */
 
 
  public void InvalidFillForm()
  {
	  genderCreateAcc.click();
	  firstNameCreateAcc.sendKeys("firstname");
	  lastNameCreateAcc.sendKeys("lastname");
	  //emailCreateAcc.sendKeys("qa.test@test.com");
	  PasswdCreateAcc.sendKeys("password");
	  
	  //Select day from Days Dropdown for DOB
	  Select day = new Select(dayCreateAcc);
	  day.selectByValue("5");
	  
	  //Select month from months Dropdown for DOB
	  Select month = new Select(monthCreateAcc);
	  month.selectByValue("4");
	  
	  //Select year from year Dropdown for DOB
	  Select years = new Select(yearCreateAcc);
	  years.selectByValue("2020");
	  
	  newsLetterCkbx.click();
	  firstNameAddrCreateAcc.sendKeys("");
	  lastNameAddrCreateAcc.sendKeys("");
	  CompanyCreateAcc.sendKeys("Techterrain");
	  AddressCreateAcc.sendKeys("");
	  CityCreateAcc.sendKeys("Tampa");
	  
	  //Select State from dropdown
	  Select state = new Select(StateCreateAcc);
	  state.selectByValue("4");
	  POCreateAcc.sendKeys("10090");
	  
	  //Select Country from dropdown
	  Select Country = new Select(CountryCreateAcc);
	  Country.selectByValue("21");
	  
	  AddInfoCreateAcc.sendKeys("test");
	  HphoneCreateAcc.sendKeys("1212222222");
	  MphoneCreateAcc.sendKeys("1111111111");
	  AliasAddCreateAcc.sendKeys("test Ave, Global");
	  RegisterCreateAcc.click();

  }

}
