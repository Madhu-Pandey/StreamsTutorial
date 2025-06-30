package testngtutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListeners interface which implements TestNG Listeners
public class Listeners implements ITestListener{

	@Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }

    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    	
    	System.out.println("Executed Listener on Test Success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
       //add screenshot code here
    	System.out.println("Executed Listener on Test Failure Method: "+ result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }
}
