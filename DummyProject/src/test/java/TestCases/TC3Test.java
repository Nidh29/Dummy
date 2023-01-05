package TestCases;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(dummy.Listeners.class)
public class TC3Test {

	
	@Test
	public void m3()
	{
		Reporter.log("TC3 Running");
	}


	
}

