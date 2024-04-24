
Feature: Validation of dashboard
  User is visiting SAT portal to view the overall implementation status using Dashboard

 
  Scenario: 
    Given User is loging in using his credential
    And He is checking the Exception count  
    And checks Stock Inventory
    And Checks Implementation
    Then checking for Phone pe Stock inventory
    And Checking Internal and External service request
		And Checking aging tracker and Merchant tracker
		Then Selecting the Merchant tracker chart from days to year