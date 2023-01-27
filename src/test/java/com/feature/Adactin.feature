Feature: Adactin Search Hotels Function Automation Testcase

Scenario: Adcatin Hotel Search with Valid Details

Given User Chrome Browser Launch
And User Website Url "https://adactinhotelapp.com/"
And Verify User Login Page Is Displayed
#And User Click Go To Build2
And User Enter Valid Username "Sheela14"
And User Enter Valid Password "sheela03071714"
Then User Click Login Button
And User Verify the Username is Displayed
And User Select Location "Paris" From Dropdown
And User Select Hotels "Hotel Sunshine" From Dropdown
And User Select RoomType "Super Deluxe" From Dropdown
And User Select No.Of.Rooms From Dropdown
And User Enter CheckIn Date
And User Enter CheckOut Date
And Select Adult_Per_Room "2 - Two" From Drpdown
And Select Children_Per_Room "1 - One" From Dropdown
Then User Click Search Button














































And User Click Terms and Condition Button
And User Click Register Button
