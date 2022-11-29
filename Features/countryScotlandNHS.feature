Feature: NHSBSA health treatment check for various combinations for country Scotland

  Scenario: NHSBSA treatment help check country Scotland
  
    Given User launches browser and enters urlscotland
    When user clicks on StartNow buttonscotland
    # And user enters other details
    Then user lands on country selection pagescotland
