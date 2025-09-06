package DataProivder;

import java.io.FileInputStream;

import org.testng.annotations.DataProvider;

public class DataprividerwithExcell 
{
	@DataProvider(name="exellData")
	public String[][]testdata()
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\rahul\\OneDrive\\Desktop\\Dev.xlsx");
		XSSFWorkbook
	}

}
