package TestNG_Script1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script03 
{
	@Test
	public void t1()
	{
		Reporter.log("goodmorning");
	}
	@Test
	public void t2()
	{
	  Reporter.log("GoodAfternoon");
	}
	
	@Test
	public void t3()
	{
		Reporter.log("Good to Go");
	}

}
