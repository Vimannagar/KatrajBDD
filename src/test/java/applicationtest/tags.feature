Feature: Profile updation and add data

@Smoke
Scenario: Open profile
Given User is at the profile view page
When user clicks on view profile button
Then profile gets display


@Regression
Scenario: Edit profile
Given User is at the edit profile page
When user clicks on Edit profile icon
Then profile gets display in editable mode

@Smoke
Scenario: Delete profile
Given User is at the delete profile page
When user clicks on delete profile icon
Then confirmation pop up should get appears




