Feature: Free CRM Login Feature


# with out example keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "batchautomation" and "Test@12345"
#Then user clicks on login button
#Then user is on home page
#Then close the browser

#With examples keyword



Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<Password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
	| username | Password |
	| batchautomation | Test@12345 |
	| gopal | Test@12345 |
	
