package com.adact_stepdefinition;

import org.junit.Assert;

import com.baseclass.Adactin_Baseclass;
import com.pageobjectmanager.Adact_PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Adactin_Stepdefinition extends Adactin_Baseclass {

	Adact_PageObjectManager pom = new Adact_PageObjectManager(driver);

	@Given("User Chrome Browser Launch")
	public void user_chrome_browser_launch() {
		browserLaunch();
	}

	@Given("User Website Url {string}")
	public void user_website_url(String string) {
		getUrl(string);

	}

	@Given("Verify User Login Page Is Displayed")
	public void verify_user_login_page_is_displayed() {
		Assert.assertTrue(elementIsDisplayed(pom.getLogin_page().adactin_Logo));
	}
	
//	@Given("User Click Go To Build2")
//	public void user_click_go_to_build2() {
//	    elementClick(pom.getLogin_page().build2);
//	}
//	
	@Given("User Enter Valid Username {string}")
	public void user_enter_valid_username(String string) {
	    elementSendkeys(pom.getLogin_page().getUsername(), string);
	}
	
	@Given("User Enter Valid Password {string}")
	public void user_enter_valid_password(String string) {
	    elementSendkeys(pom.getLogin_page().getPassword(), string);
	}
	@Then("User Click Login Button")
	public void user_click_login_button() throws InterruptedException {
	    elementClick(pom.getLogin_page().loginButton);
	    threadSleepOfSec();
	    
	}
	@Then("User Verify the Username is Displayed")
	public void user_verify_the_username_is_displayed() {
	    Assert.assertTrue(pom.elementIsDisplayed(pom.getLogin_page().show_Username));
	    
	}
	@Then("User Select Location {string} From Dropdown")
	public void user_select_location_from_dropdown(String string) {
	    selectDropdown(pom.getLogin_page().location, "Text", string);
	    
	}
	@Then("User Select Hotels {string} From Dropdown")
	public void user_select_hotels_from_dropdown(String string) {
		selectDropdown(pom.getLogin_page().hotels, "Text", string);
	    
	}
	@Then("User Select RoomType {string} From Dropdown")
	public void user_select_room_type_from_dropdown(String string) {
		selectDropdown(pom.getLogin_page().room_Type, "Text", string);
	    
	}
	@Then("User Select No.Of.Rooms From Dropdown")
	public void user_select_no_of_rooms_from_dropdown() {
		selectDropdown(pom.getLogin_page().no_Of_Rooms, "Text", "2 - Two");
	    
	}
	
	@Then("User Enter CheckIn Date")
	public void user_enter_check_in_date() {
	    elementSendkeys(pom.getLogin_page().check_In, "14/07/2023");
	    
	}
	@Then("User Enter CheckOut Date")
	public void user_enter_check_out_date() {
	    elementSendkeys(pom.getLogin_page().check_Out, "16/07/2023");
	    
	}
	@Then("Select Adult_Per_Room {string} From Drpdown")
	public void select_adult_per_room_from_drpdown(String string) {
	    selectDropdown(pom.getLogin_page().adult_Room, "Text", string);
	    
	}
	@Then("Select Children_Per_Room {string} From Dropdown")
	public void select_children_per_room_from_dropdown(String string) {
	    selectDropdown(pom.getLogin_page().child_Room, "Text", string);
	    
	}
	@Then("User Click Search Button")
	public void user_click_search_button() {
	    elementClick(pom.getLogin_page().search_Button);
	    
	}
	
	@Then("User Click Terms and Condition Button")
	public void user_click_terms_and_condition_button() {
	   
	}
	@Then("User Click Register Button")
	public void user_click_register_button() {
	    
	}


	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}