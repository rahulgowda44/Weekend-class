package Priority;

import org.testng.annotations.Test;

public class PriorityScript03 
{
	@Test(invocationCount=2)
	public void signup()
	{
		System.out.println("Signup Module");
	}
	@Test(invocationCount=3)
	public void login()
	{
		System.out.println("This is Login module");
	}
}