Feature: NHSBSA health treatment check for various combinations for country NorthernIreland


Background: Browser and URL given and start page launched
    Given user is on the startpage
    When user clicks on StartNow 

@runthis
 Scenario: NHSBSA treatment help check country NorthernIreland
  
   
    And user selects country NorthernIreland
    And user clicks Next button
    Then user checks the treatment helpnorthernireland
    And close Browser
 
 @runthat   
  Scenario: NHSBSA other treatment help check country NorthernIreland

    And user selects country NorthernIreland2
    And user clicks Next button2
    Then user checks the other treatment helpnorthernireland2
    And close Browser2
 
 
    
   