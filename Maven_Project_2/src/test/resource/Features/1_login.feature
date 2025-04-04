Feature: Login feature

Scenario: Verify login is successful with valid credentials

Given Login page is displayed
When User enter valid username and password
When User clicks on login button
Then The product page is displayed

Scenario: Verify login is unsuccessful with invalid credentials

Given Login page is displayed
When User enter invalid username and password
When User clicks on login button
Then The product page will not be displayed


Scenario: Verify login is successful with valid credentials

Given Login page is displayed
When User enter valid username and password
When User clicks on login button
Then The product page is displayed