package baseSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {

	private WebDriver driver;

	public WebDriver getDriver()
	{
	System.setProperty("webdriver.chrome.driver","D:/Google/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://automationpractice.com");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	return driver;
	}

	public void closeBrowser()
	{
		driver.close();
	}
}
