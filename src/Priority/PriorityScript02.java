package Priority;

import org.testng.annotations.Test;

public class PriorityScript02 
{
	@Test(priority=1)
	public void signup()
	{
		System.out.println("Signup Module");
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("This is Login module");
	}
	@Test(enabled=false)
	public void profilepage()
	{
		System.out.println("This is Profile Page");
	}
	@Test(enabled=false)
	public void logout()
	{
		System.out.println("This is Logout Module");
	}

}
