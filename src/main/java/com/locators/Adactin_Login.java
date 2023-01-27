package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Adactin_Baseclass;

public class Adactin_Login extends Adactin_Baseclass {
	
	public Adactin_Login(WebDriver wdriver) {
		this.driver = wdriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//img[@class='logo']")
	public WebElement adactin_Logo;
	
	@FindBy(linkText = "Go to Build 2 ")
	public WebElement build2;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	public WebElement loginButton;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id = "username_show")
	public WebElement show_Username;


	@FindBy(id = "location")
	public WebElement location;
	
	@FindBy(id = "hotels")
	public WebElement hotels;
	
	@FindBy(id = "room_type")
	public WebElement room_Type;
	
	@FindBy(id = "room_nos")
	public WebElement no_Of_Rooms;
	
	@FindBy(id = "datepick_in")
	public WebElement check_In;
	
	@FindBy(id = "datepick_out")
	public WebElement check_Out;
	
	@FindBy(id = "adult_room")
	public WebElement adult_Room;
	
	@FindBy(id = "child_room")
	public WebElement child_Room;
	
	@FindBy(id = "Submit")
	public WebElement search_Button;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
