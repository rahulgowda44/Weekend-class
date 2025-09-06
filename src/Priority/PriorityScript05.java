package Priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityScript05 

{
	//Alphabetically execute-if anything fail it will stop execution
	@Test
	public void signup()
	{
		System.out.println("signup Module");
	}
	@Test(dependsOnMethods="signup")
	public void login()
	{
		System.out.println("This is Login module");
		Assert.fail();
	}
	@Test(dependsOnMethods="login")
	public void homepage()
	{
		System.out.println("This is Homepage Module");
	}
	@Test(dependsOnMethods="homepage")
	public void profilepage()
	{
		System.out.println("This is Profile Page");
	}
	@Test(dependsOnMethods="profilepage")
	public void logout()
	{
		System.out.println("This is Logout Module");
	}

}
