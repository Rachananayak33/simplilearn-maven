package com.main;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(com.main.MyListeners.class)
public class FirstClassInMaven {
	
	@Test
	public void testMethod1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\racha\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.quit();
		/* System.out.println("+++++++"+System.getProperty("env.BROWSER")); */
		}
	
		/*
		 * @Test public void testMethod2() { Assert.fail(); }
		 * 
		 * @Test(dependsOnMethods = "testMethod2" ) public void testMethod3() { }
		 */
}
