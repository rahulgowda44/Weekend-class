package Priority;

import org.testng.annotations.Test;

public class PriorityScript01 
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
	@Test(priority=3)
	public void homepage()
	{
		System.out.println("This is Homepage Module");
	}
	@Test(priority=4)
	public void profilepage()
	{
		System.out.println("This is Profile Page");
	}
	@Test(priority=5)
	public void logout()
	{
		System.out.println("This is Logout Module");
	}

}
