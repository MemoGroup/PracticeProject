package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyListeners implements ITestListener
{
	static ExtentTest test;
	static ExtentReports report;
	@Override		
    public void onFinish(ITestContext arg0) {					
		System.out.println("Ending Testcases");
		report.endTest(test);
		report.flush();
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
    	System.out.println("Starting Execution");
    	report=new ExtentReports("reports/"+new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date())+" reports.html",false);
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
    	System.out.println("Testcase: "+ arg0.getTestName()+" Failed but within Success Percentage");
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
    	System.out.println("Testcase: "+ arg0.getName()+" Failed");
    	test.log(LogStatus.FAIL,"Testcase: "+ arg0.getMethod().getMethodName()+" is a Fail" );
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
    	System.out.println("Testcase: "+ arg0.getName()+" Skipped");
    	test.log(LogStatus.SKIP,"Testcase: "+ arg0.getMethod().getMethodName()+" is skipped" );
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
    	System.out.println("Test: "+ arg0.getName()+" Started");
    	test = report.startTest(arg0.getMethod().getMethodName());
    	test.log(LogStatus.INFO, arg0.getMethod().getMethodName() + "test is started");
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
    	System.out.println("Testcase: "+ arg0.getName()+" Succeed"+arg0.getMethod().getMethodName());
    	test.log(LogStatus.PASS,"Testcase: "+ arg0.getName()+" is a Pass" );
    }	
}
