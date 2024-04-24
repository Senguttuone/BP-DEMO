

Feature: Validating login functionality
  User is trying to login SAT Portal using his credentials

  
  Scenario: User is entering his credential 
    Given User is in the login page
    When User is entering "testingSAT@bijlipay.co.in" in user id field
    Then Entering "password" in password field
    And User clciking login button


