Feature: searching for different orders placed by an user

Background:
Given User is registered to the amazon application
And user is at the login page
When user enters UserName
And User enters password
And click on login button
Then Amazon user page should be displayed
When user clicks on Orders

Scenario: search the open orders
When user clicks on Open orders
Then all the open orders should be displayed

Scenario: search for the Cancelled orders
When user clicks on Cancelled orders
Then all the Cancelled orders should be displayed

Scenario: search for the Pending orders
When user clicks on Pending orders
Then all the Cancelled orders should be displayed