Feature: this is for multiple scenarios

@Test
Scenario: login feature with "valid" un and pwd
When user enters user name and password
Then user login should be successful

@Test
Scenario: login feature with "invalid" un and pwd
When user enters user name and password
Then user login should be successful

@Test
Scenario: Serach the emails for flipkart
Given User is already logged into the gmail
When search for the "flipkart" emails

@Test
Scenario: select the emails from flipkart
When select the emails from flipkart
Then user should be able to select the emails
