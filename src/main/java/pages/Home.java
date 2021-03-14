package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	//1. Constructor
	//2.Locators
	//3. Methods
	
	private WebDriver driver;//global variable driver
	
	public Home(WebDriver driver)//parametric constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id = "search_query_top")
	public WebElement searchField;
	
	public void verifySearchField()
	{
		System.out.println("Search filed is "+ searchField.isDisplayed());
	}
	
	
}
