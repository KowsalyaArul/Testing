Feature: Login Feature

@sets
Scenario Outline: Login with valid and invalid login credentials.
Given The login page is displayed
When user enters "<username>" and "<password>"
Then user session should be available

    Examples: 
      | username  | password | message  |
      | standard_user |  secret_sauce | Products |
      
