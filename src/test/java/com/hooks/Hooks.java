package com.hooks;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.Adactin_Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Adactin_Baseclass {

	@Before
	public static void beforeHooks() {
		System.out.println("Browser Launched");
	}

	@After
	public static void afterHooks(Scenario sc) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshotAs, "image/png", "Screenshot");
		
		driver.quit();
		System.out.println("Test Case Executed");
	}

}
