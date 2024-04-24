
Feature: User is checking the status of Lead in lead validation
  To view the status of a lead
  Scenario: User is checking a lead status by searching with lead id
    Given User is in lead validation page and clicks on date sorting
    And User is searching in search tab with a valid lead id "CHEI292220"
    When User confirming the Finance approval status is pending
    And User confirms SAT status before finance approval as pending
    And User confirms VALIDATE button is disabled before finance approval
    Then User confirms REJECT LEAD button is Enabled
    And User confirms the lead details has come to lead validation list
