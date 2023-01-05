package TestCases;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(dummy.Listeners.class)
public class TC1Test {
	
	@Test
	public void m1()
	{
		Reporter.log("TC1 Running");
	}


	
}
