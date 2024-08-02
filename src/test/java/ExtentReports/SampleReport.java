package ExtentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	@Test
	public void BasicReport() {
	
		//create spark Reporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/SampleReport.html");
		//Configure the spark Reporter
		spark.config().setDocumentTitle("SampleReport");
		
		spark.config().setReportName("Suraj");
		
		spark.config().setTheme(Theme.DARK);
		
		//create the extent report
		
		ExtentReports report = new ExtentReports();
		
		report.setSystemInfo("Os", "Window-11");
		
		//attack the spark reporter to the extent report
		
		report.attachReporter(spark);
		ExtentTest test  = report.createTest("BasicReport");
		test.log(Status.INFO, "report is Succesfully created");
	    report.flush();
		
		
	}

}
