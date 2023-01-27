package com.baseclass;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin_Baseclass {

	public static WebDriver driver;

	public static void browserLaunch() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace2\\Adactin_SignIn\\src\\test\\resources\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Browser Cannot be Launched");
		}
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void elementSendkeys(WebElement element, String string) {
		try {
			element.sendKeys(string);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void windowMaximize() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Boolean elementIsDisplayed(WebElement element) {
		Boolean displayed = false;
		try {
			displayed = element.isDisplayed();
			System.out.println(displayed);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return displayed;
	}

	public static String scannerInput(String string) {
		String next = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Captcha Text:");
			next = sc.next();
			System.out.println(next);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return next;

	}

	public static void threadSleepOfSec() throws InterruptedException {
		TimeUnit.SECONDS.sleep(4);
	}

	public static Boolean elementIsEnabled(WebElement element) {
		Boolean enabled = false;
		try {
			enabled = element.isEnabled();
			System.out.println(enabled);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return enabled;
	}

	public static void selectDropdown(WebElement element, String option, String value) {
		Select sc = new Select(element);
		if (option.equals("Index")) {
			sc.selectByIndex(Integer.parseInt(value));
		} else if (option.equals("Text")) {
			sc.selectByVisibleText(value);
		} else if (option.equals("Value")) {
			sc.selectByValue(value);
		}
	}

}
