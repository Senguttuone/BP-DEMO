

Feature: Completeing WIP lead update
  User entering data for WIP lead


  Scenario: WIP lead data entry
    Given User Login using valid credentials 
    And User selecting bijlipay lead creation WIP status
    When User clicking on WIP update
    And User Selects state "TAMIL NADU"
    And User selects merchant district "Chennai"
    And User selects merchant subdistrict "Chennai"
    And User selects merchant sub district "Chennai(MCorp)"
    And User selects lead source banks "LS_FEDERAL BANK"
    And User selects device type "75"
    And user enters device count "1"
    And User selects merchant category type "Govt Entities"
    And User selects MDR plan as "Default"
    And User selects Plan period "2 Year Plan"
    And User enters amount collected "0"
    And User select transaction date on calendar "18"
    And User select payment type as "NEFT"
    And User enters NEFT number "321654987"
    And User selects merchant type "Sole Proprietorship"
    Then User submits to SAT
    


