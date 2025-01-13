package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extend_report {
	WebDriver driver;
	String url="https://www.facebook.com";//url goto
	ExtentSparkReporter reporter; //3 classes references
	ExtentTest test;
	ExtentReports extent; 
	
	@BeforeTest
	public void beftest() {
		reporter=new ExtentSparkReporter("./Reports/myreport1.html");//call ExtentSparkReporter and paste the file location for report
		reporter.config().setDocumentTitle("Automation");//Document title
		reporter.config().setReportName("Functional test");//Report name
		reporter.config().setTheme(Theme.DARK);//theme of website(dark theme)
		extent=new ExtentReports();//call extentreports for entry and insert data into the website
		extent.attachReporter(reporter);//attach the webbrowser report to extent reports
		extent.setSystemInfo("hostname","localhost");// To set up the system info of the reports (depends on test)
		extent.setSystemInfo("OS","Windows 10");
		extent.setSystemInfo("Tester Name","ABC");
		extent.setSystemInfo("Browser name","Chrome");
		driver=new ChromeDriver();
	}
	@BeforeMethod // runs the beforemethod after every tests(means refreshes the browser after every test)
	public void setup() {
		driver.get(url);
	}
	@Test
	public void Fbtitleverification() {
		test=extent.createTest("FBtitleverification");//to create a section name "FBtitleverifiaction"(always give title in method name itself)
		String exp="facebook";
		String act=driver.getTitle();
		Assert.assertEquals(exp,act);//used to compare both expected and actual titles
	}
	@AfterMethod //This the main method for report for all details of report is given
	public void browserclose(ITestResult result) throws Exception// ITestResult==previously executed method is obtained by this interface(get result of previous test)
	{
		if(result.getStatus()==ITestResult.FAILURE)//get the status of the result and check for failure
		{
			test.log(Status.FAIL,"test case failed is"+result.getName());//print status fail and print fail method
			test.log(Status.FAIL,"test case failed is"+result.getThrowable());//print error message by this code
			String Screenshotpath=screenshotMethod(driver,result.getName());//Calls the screenshot method
			test.addScreenCaptureFromPath(Screenshotpath);//takes screenshot of failures
		}else if(result.getStatus()==ITestResult.SKIP) //if result is skip
		{
			test.log(Status.SKIP,"test case skipped is"+result.getName());//get name of method which is skipped
		}else if(result.getStatus()==ITestResult.SUCCESS) //if result is success
		{
			test.log(Status.PASS,"test case passes is"+result.getName());//get name of method which is passed
		}
	}
	public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//source file for screenshot
		String destination="./screenshot/"+screenshotname+".jpeg";//storing location
		FileHandler.copy(src,new File(destination));//copy the the screenshot to that location
		return destination;
	}
	@AfterTest
	public void teardown() {
		extent.flush();//to generate the report finally after everything in report
	}
}
