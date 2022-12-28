Feature: User Regisrtation

Scenario: user registration with different data with columns
Given User is on registration page
When User enters following user details with columns
|Fname|Lname|email|ph no|city|
| naveen | automation | nav@gmail.com | 99999 | Bangalore |
| tom | peter | tom@gmait.com | 99999 | London |
| lisa | dsouza | Lisaggmail.com | 8887777 | SFO |
Then user registration should be successfull