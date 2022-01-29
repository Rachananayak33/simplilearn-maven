package com.util;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReporter {
	public static ExtentReports extent;
	public static ExtentReports createReport() {
		extent = new ExtentReports("C:/Users/racha/eclipse-workspace/simplilearn-maven/report/MyFirstReport.html");
		return extent;
	}

}
