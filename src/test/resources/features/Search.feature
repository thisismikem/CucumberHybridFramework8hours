Feature: Search functionality

Background: User opens the Application Page
Given User opens the Application

@smoke @regression
Scenario: User searches for a valid product
When User enters valid product "HP" into Search box field
And User clicks on Search button
Then User should get valid product displayed in search results

@smoke @important
Scenario: User searches for an invalid product
When User enters invalid product "Honda" into Search box field
And User clicks on Search button
Then User should get a message about no product matching

@smoke
Scenario: User searches without any product
When User dont enter any product name into Search box field
And User clicks on Search button
Then User should get a message about no product matching