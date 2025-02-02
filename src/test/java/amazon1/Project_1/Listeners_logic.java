package amazon1.Project_1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners_logic implements ITestListener 
{
	WebDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Testcase passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		Reporter.log("Testcase failed");
	/*TakesScreenshot ts=(TakesScreenshot)driver;  //((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\kales\\eclipse-workspace\\Project_1\\Failure_screenshotsone" +Math.random()+".png");*/
	}

	
	
	
	
	
	
}
