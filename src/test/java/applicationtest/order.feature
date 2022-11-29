Feature: tracking order

Background:
Given user should be at amazon login page
When user enters the username
When user enters the password
And user click on login button
Then user should be able to login


Scenario: verify previous placed order
When user click on the previous order link
Then user should see the previously placed order


Scenario: track current placed order
When user click on the order link
Then user should see the placed order