Feature: Adding Item In Cart

Scenario: Verify User added Samsung6 in cart


Given launch "<URL>"
Then Click login 
Then Enter username and password and click login
Then Click Samsung6 hyperlink and add to cart 
Then Click Cart
Then Verify Samsung6 added in cart 