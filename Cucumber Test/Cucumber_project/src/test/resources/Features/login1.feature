
Feature: login functionality

Scenario: Check login is successfull with valid credentails
	Given the user is on login page
	When user enter username and password
	And click login button
	Then the user should be directed to home page 
