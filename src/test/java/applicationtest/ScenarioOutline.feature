Feature: Login functionality
Scenario Outline: Login with different invalid combinations
Given user is on the application landing page
When user click on signin button
Then login screen will get display
When user enters "<username>" in field inside username
And user enters "<password>" in field inside password
And user click on login button over the screen
Then user gets login failed message

Examples:
| username | password |
| john | 123456 |
| albert | a123 |
| incorrectusername | incorrectpassword |
