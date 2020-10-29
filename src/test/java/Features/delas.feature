Feature: FreeCRM Deals
Scenario: Deals Create Scenrios
Given user is already on Login Page
When title of login page is Free CRM
Then user enter username and password
| batchautomation | Test@12345 |
Then user clicks on login button
Then user is on home page
Then user clicked delas links
Then user created delas data
| test deal | 1000 | 50 | 10 |
Then close the browser



