package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.baseclass.Adactin_Baseclass;
import com.locators.Adactin_Login;

public class Adact_PageObjectManager extends Adactin_Baseclass {
	
	public Adact_PageObjectManager(WebDriver wdriver) {
		this.driver = wdriver;
	}
	
	private Adactin_Login login_page;

	public Adactin_Login getLogin_page() {
		if(login_page == null) {
			login_page = new Adactin_Login(driver);
		}
		return login_page;
	}
	

	
}
