Feature: login to the application 

Scenario: login with valid credentials
Given User is already registered to application 
And login with valid credentials
When User click on login 
And login shuld be successful
Then After login landing page should be Welcom page
And Welcome page with comapnay logo