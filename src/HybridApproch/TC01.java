package HybridApproch;

import org.testng.annotations.Test;

public class TC01 extends GenericScript
{
  @Test
 public void TC1()
 {
	  String title=driver.getTitle();
	  System.out.println(title);
 }
}
