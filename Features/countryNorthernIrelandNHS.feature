Feature: NHSBSA health treatment check for various combinations for country NorthernIreland



 

 Scenario: NHSBSA treatment help check country NorthernIreland
  
    Given user is on the startpage
    When user clicks on StartNow 
    And user selects country NorthernIreland
    And user clicks Next button
    Then user checks the treatment helpnorthernireland
    And close Browser
 
 
    
   