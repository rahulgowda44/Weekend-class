package Priority;

import org.testng.annotations.Test;

public class PriorityScript04 
{
	//Alphabetically execute
	@Test
	public void signup()
	{
		System.out.println("Signup Module");
	}
	@Test
	public void login()
	{
		System.out.println("This is Login module");
	}
	@Test
	public void homepage()
	{
		System.out.println("This is Homepage Module");
	}
	@Test
	public void profilepage()
	{
		System.out.println("This is Profile Page");
	}
	@Test
	public void logout()
	{
		System.out.println("This is Logout Module");
	}

}