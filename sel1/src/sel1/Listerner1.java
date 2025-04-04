package sel1;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listerner1 implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Failed: "+result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Success: "+result.getName());
	}
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Started: "+result.getName());
	}

}
