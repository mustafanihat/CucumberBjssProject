Feature: Challenging Page
@wip
  Scenario: Challenging page test1
    Given user Navigate to "https://the-internet.herokuapp.com/"
    When user click to "Challenging DOM"
    And take the blue,red and green button ids
    And click red button
    And take the buttons id again
    Then the first button ids and second button ids should be different