Feature: FreeCRM Deals
Scenario: Deals Create Scenrios
Given user is already on Login Page
When title of login page is Free CRM
Then user enter username and password
| username | password |
| batchautomation | Test@12345 |
Then user clicks on login button
Then user is on home page
Then user clicked delas links
Then user created delas data
| title | amount | probability | commission |
| test dealGopal | 1000 | 50 | 10 |
| test dealKumar | 2000 | 60 | 20 |
| test dealSubbu | 3000 | 70 | 30 |
 
Then close the browser