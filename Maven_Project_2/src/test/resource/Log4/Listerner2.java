package Log4;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listerner2 implements ITestListener{
	Logger log=LogManager.getLogger(Listerner2.class);
	
	@Override
	public void onTestFailure(ITestResult result) {
		String p="path",fn="filename";
		System.out.println("Test Failed: "+result.getName());
		Reporter.log(": Screenshot Filename: "+p + " "+fn);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		BasicConfigurator.configure();
		log.info("Test Name : "+result.getName()+" Started");
		Reporter.log("Test Success: "+  result.getName());
	}
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Started: "+result.getName());
	}

}




















