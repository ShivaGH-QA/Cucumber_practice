Feature: perform serach operation

Scenario: perform search operation and verify prices
Given User is logged in successfully to application
When search for "philips Air Purifiers" in search field 
And price range as 1000
Then search result should be listed
And user selects an item for purchase
Then user pays amount 1000