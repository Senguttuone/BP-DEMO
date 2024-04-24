
Feature: Validating Lead creation future
  User need to create lead using SAT Portal
Scenario:
    Given User is in SAT Portal Dashboard view
    When User is going to create a lead by lead creation functionality
    Then Entering "Test" detail
    And Enters contact name "Test" 
    And Enters contact number "1234567890"
    And Enters alternate conatct number"3212321232" 
    And Enters mail id "test@gmail.com"
    And Enters merchant address "abc"
    And Enters pincode "60000"
    And Enters region "CHENNAI"
    And Enters lead source "AME POS"
    And Enters device type "MPOS"
    And Enters device count "5"
    Then Submits the form 
  