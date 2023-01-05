package dummy;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners  implements ITestListener{
	
	ExtentReports er;
	
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		
		String name = result.getName();
		//particular test monitor
		test = er.createTest(name);
		
		
	}

	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		
		test.log(Status.PASS, name+"-----pass");
	}

	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		
		test.log(Status.FAIL, name+"-----fail");
	}

	public void onTestSkipped(ITestResult result) {
		String name = result.getName();
		
		test.log(Status.SKIP, name+"-----skipped");
	}

	public void onStart(ITestContext context) {
		
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\ExtentReport\\"+3+".html");
		
		esr.config().setDocumentTitle("Final vtiger application");
		//to provide the title of the report
		esr.config().setTheme(Theme.STANDARD);
		//to provide the theme
		esr.config().setReportName("Nidhi");
		//to provide the reporter name
		 er= new ExtentReports();
		
		er.attachReporter(esr);
		
		er.setSystemInfo("Operarating System", "Window");
		
		er.setSystemInfo("Language", "Java");
	}

	public void onFinish(ITestContext context) {
		// it is going to consolidate the report
		er.flush();
	}
	

	
}
