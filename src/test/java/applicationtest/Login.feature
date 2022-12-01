Feature: Login functionality
Scenario: Verify the login functionality
Given User is at the login screen
When User enters the username
When User enters the password
And User clicks on login button
Then User should get login to application