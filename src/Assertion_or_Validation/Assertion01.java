package Assertion_or_Validation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion01 
{
	@Test
	public void fetchTitele()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromdriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedTitele= "Facebook";
		String actualTitele=driver.getTitle();
		Assert.assertEquals(actualTitele, expectedTitele);
		System.out.println(actualTitele);
		driver.quit();
	}
	@Test
	public void fetchCurrenturl()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromdriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedurl= "FACEBOOK.com";
		String actualurl=driver.getTitle();
		Assert.assertEquals(actualurl, expectedurl);
		System.out.println(actualurl);
		driver.quit();
	}

}
