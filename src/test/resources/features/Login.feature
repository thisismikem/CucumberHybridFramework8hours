@mustRun
Feature: Login functionality

Background: Navigates to login page
Given User navigates to login page

@smoke @regression
Scenario Outline: Login with valid credentials
When User enters valid email address <uname> into email field
And User enters valid password <pwd> into password field
And User clicks on Login button
Then User should get successfully logged in
Examples:
|uname|pwd|
|amotooricap1@gmail.com|12345|
|amotooricap2@gmail.com|12345|
|amotooricap3@gmail.com|12345|

@smoke @important
Scenario: Login with invalid credentials
When User enters invalid email address into email field
And User enters invalid password "1234567890" into password field
And User clicks on Login button
Then User should get a proper warning message "Warning: No match for E-Mail Address and/or Password."

@smoke @important
Scenario: Login with valid email and invalid password
When User enters valid email address "amotooricap9@gmail.com" into email field
And User enters invalid password "1234567890" into password field
And User clicks on Login button
Then User should get a proper warning message "Warning: No match for E-Mail Address and/or Password."

@smoke
Scenario: Login with invalid email and valid password
When User enters invalid email address into email field
And User enters valid password "12345" into password field
And User clicks on Login button
Then User should get a proper warning message "Warning: No match for E-Mail Address and/or Password."

@smoke
Scenario: Login without providing any credentails
And User clicks on Login button
Then User should get a proper warning message "Warning: No match for E-Mail Address and/or Password."

@smoke
Scenario: Login without Password
When User enters valid email address "amotooricap9@gmail.com" into email field
And User clicks on Login button
Then User should get a proper warning message "Warning: No match for E-Mail Address and/or Password."