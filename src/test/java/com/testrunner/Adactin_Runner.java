package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactin.feature", glue = { "com.adact_stepdefinition",
		"com.hooks" }, dryRun = false, stepNotifications = true, plugin = { "html: target\\report\\Adactin_Signin.html",
				"json: target\\report\\AdactinSignin.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = true, monochrome = true)

public class Adactin_Runner {

}
