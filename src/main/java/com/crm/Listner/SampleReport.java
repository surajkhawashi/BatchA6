package com.crm.Listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport implements ITestListener{
	ExtentReports report;
	ExtentSparkReporter spark;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		Reporter.log(t_name+"is executed");
		test=report.createTest(t_name);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		test.log(Status.PASS,t_name+"is Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		test.log(Status.FAIL,t_name+"is Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		test.log(Status.SKIP,t_name+"is Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		
		        //create spark Reporter
				ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/Multiple.html");
				//Configure the spark Reporter
				spark.config().setDocumentTitle("SampleReport");
				
				spark.config().setReportName("Suraj");
				
				spark.config().setTheme(Theme.DARK);
				
				//create the extent report
				
				ExtentReports report = new ExtentReports();
				
				report.setSystemInfo("Os", "Window-11");
				
				//attack the spark reporter to the extent report
				
				report.attachReporter(spark);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
