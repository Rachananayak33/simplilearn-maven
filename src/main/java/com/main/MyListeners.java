package com.main;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExtentReporter;

public class MyListeners implements ITestListener {
	ExtentReports extent;
	ExtentTest test;
	

	@Override
	public void onStart(ITestContext context) {
		System.out.println("This is starting of"+ context.getName());
		extent = ExtentReporter.createReport();
		test = extent.startTest(context.getName());
	}
	

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("My Test"+result.getName()+" is Successfull");
		test.log(LogStatus.PASS, result.getName()+" Is Passed");
	}

	/*
	 * @Override public void onTestFailure(ITestResult result) {
	 * System.out.println("My Test"+result.getName()+" is Failed");
	 * test.log(LogStatus.FAIL, result.getName()+" Is Failed");
	 * 
	 * }
	 * 
	 * 
	 * @Override public void onTestSkipped(ITestResult result) {
	 * System.out.println("My Test"+result.getName()+" is Skipped");
	 * test.log(LogStatus.SKIP, result.getName()+" Is Skipped");
	 * 
	 * }
	 * 
	 */
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is end");
		extent.endTest(test);
		extent.flush();
	}
	
	

}
