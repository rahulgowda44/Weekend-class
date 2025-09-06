package HybridApproch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageObjects

{
	//Declaration
	//initialization
	//Utilization
	@FindBy(id="eamil")
	private WebElement usnTf;
	@FindBy(id="pass")
	private WebElement pswTf;
	@FindBy(name="login")
    private WebElement loginBtn;
    
    //Initialization
    LoginpageObjects(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    //Utilization
    public void enterusn()
    {
    	usnTf.sendKeys("rahulgowda44@gmail.com");
    }
    public void enterpsw()
    {
    	pswTf.sendKeys("9591400905");
    }
    public void clicklogin()
    {
    	loginBtn.click();
    }
}