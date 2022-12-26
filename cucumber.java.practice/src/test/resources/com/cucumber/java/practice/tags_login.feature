

Feature: login to the application

@Smoke
Scenario: login with valid credentials
Given User is already registered to application
And login with valid credentials
When User click on login 
And login shuld be successful
Then After login landing page should be Welcom page

@Regression
Scenario: login with IN-valid credentials
Given User is already registered to application
And login with valid credentials
When User click on login 
And login shuld be successful
Then After login landing page should be Welcom page

@Prod
Scenario: login with GOOD-valid credentials
Given User is already registered to application
And login with valid credentials
When User click on login 
And login shuld be successful
Then After login landing page should be Welcom page