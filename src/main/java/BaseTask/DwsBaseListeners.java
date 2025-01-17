package BaseTask;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class DwsBaseListeners extends DwsBaseAnno implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log("onTestStart",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDate Date = LocalDate.now();
		String time = Date.toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to=new File("./ScreenShot//Dwspage"+time+".png");
		try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped",true);
		
	}
	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish",true);

	}
}
