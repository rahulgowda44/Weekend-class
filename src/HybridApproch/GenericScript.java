package HybridApproch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript 
{
	WebDriver driver;
	@BeforeMethod
	public void initBrowser()
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
    }
  @AfterMethod
  public void clseBrowser()
  {
	  driver.quit();
  }
}