Feature: Automate swiggy

@Automate_Swiggy
Scenario: A user should be able to successfully place an order on swiggy
Given a user is on home page of swiggy
When he enters a location "<location>"
And select the location from dropdown
And then clicks on first search result 
And click on Add button
And click on checkout 
And click on Have an account? Log IN button
Then Verify if user is able to see "To place your order now, log in to your existing account or sign up."
Examples: 
|location|
|udaipur|