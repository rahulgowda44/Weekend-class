package HybridApproch;

import org.testng.annotations.Test;

public class TC02 extends GenericScript
{
  @Test
  public void TC2()
  {
	String url=driver.getCurrentUrl();
	System.out.println(url);
  }
}
