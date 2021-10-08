Feature: This is to test google search
Scenario: Google search
Given user is entering google.co.in
When user is tying search word "Giri"
And enters the return key
Then user should able to see the search results
