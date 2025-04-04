Feature: Login feature
@set3
Scenario: Verify login is successful 

Given Login page should is displayed
When User enter valid username and password
When User clicks on login button
Then The product page is displayed

