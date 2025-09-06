package HybridApproch;

import org.testng.annotations.Test;

public class TC03 extends GenericScript

{
	@Test
	public void TC3()
	{
		LoginpageObjects lp = new LoginpageObjects(driver);
		lp.enterusn();
		lp.enterpsw();
		lp.clicklogin();
        
	}

}
