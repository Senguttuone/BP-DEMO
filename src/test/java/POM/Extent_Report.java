package POM;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Extent_Report {
	 private static ExtentReports extent;
	    private static ExtentTest test;

	    @Before(order = 0)
	    public static synchronized void setUp(String reportname) {
	        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportname);
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	    }

	    @Before(order = 1)
	    public static synchronized void testname(String scenario) {
	        test = extent.createTest(scenario);
	    }

	    @After
	    public static synchronized void afterScenario() {
	        extent.flush();
	    }

	    public static synchronized void logpass(String message) {
	        test.log(Status.PASS, message);
	    }
	    public static synchronized void logfail(String message) {
	        test.log(Status.FAIL, message);
	    }

}
