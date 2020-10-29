Feature: Free CRM Login Feature
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<Password>"
Then user clicks on login button
Then user is on home page
Then user clicked contacts links
Then user enetred "<firstname>" and "<lastname>" and "<position>"
Then close the browser
Examples:
	| username | Password |firstname | lastname | position |
	| batchautomation | Test@12345 | Gopal | Raja | manager |
	| batchautomation | Test@12345 | siva | kumar | director |