Feature: Registration functionality

Background: Navigates to Register page
Given User navigates to Register Account page

@smoke @regression
Scenario: User creates an account only with mandatory fields
When User enters the details into below fields
|firstName	|Arun										|
|lastName	|Motoori									|
|telephone	|1234567890									|
|password	|12345										|
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

@smoke @important
Scenario: User creates an account with all fields
When User enters the details into below fields
|firstName	|Arun										|
|lastName	|Motoori									|
|telephone	|1234567890									|
|password	|12345										|
And User selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

@smoke
Scenario: User creates a duplicate account
When User enters the details into below fields with duplicate email
|firstName	|Arun										|
|lastName	|Motoori									|
|email		|amotooricap4@gmail.com			            |
|telephone	|1234567890									|
|password	|12345										|
And User selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User should get a proper warning about duplicate email

@smoke
Scenario: User creates an account without filling any details
When User dont enter any details into fields
And User clicks on Continue button
Then User should get proper warning messages for every mandatory field
