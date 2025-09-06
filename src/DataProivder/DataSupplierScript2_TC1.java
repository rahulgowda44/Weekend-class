package DataProivder;

import org.testng.annotations.DataProvider;

public class DataSupplierScript2_TC1 
{
	@DataProvider(name="testdata")
	public String[][]testdata()
	{
		String[][] cred= {{"abc","abc@123"},{"xyz","xyz@123"},{"admin","admin@1123"},{"user","user@123"}};
		return cred;
	}

}
