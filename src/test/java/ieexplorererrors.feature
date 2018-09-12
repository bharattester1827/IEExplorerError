Feature: IE Explorer Errors

@homepage
Scenario: IE opened and browser opened with entering valid username and password 

Given IE opened and website opened
When Enter valid username and password
Then login successfully