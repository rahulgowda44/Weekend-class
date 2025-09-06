package DataProivder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderbetween2calssScript2 
{
	@Test(dataProvider="testdata",dataProviderClass =DataSupplierScript2_TC1.class)
	public void login(String usn1, String psw1) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usn=driver.findElement(By.id("email"));
		WebElement psw=driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.name("login"));
		usn.sendKeys(usn1);
		psw.sendKeys(psw1);
		login.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
