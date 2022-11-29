Feature: NHSBSA health treatment check for various combinations for country Wales

  Scenario: NHSBSA treatment help check country Wales
  
    Given User launches browser and enters urlwales
    When user clicks on StartNow buttonwales
    # And user enters other details
    Then user lands on country selection pagewales
