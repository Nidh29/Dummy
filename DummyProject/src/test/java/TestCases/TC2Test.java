package TestCases;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(dummy.Listeners.class)
public class TC2Test {

	
	
		@Test
		public void m2()
		{
			Reporter.log("TC2 Running");
		}


		
}
