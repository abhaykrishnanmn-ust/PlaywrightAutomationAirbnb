Feature: Verify the details

  Scenario: Verify things to do with what you will do
    Given user opens website
    And verify user is on homepage
    When user clicks on things to do
    Then user selects destination
    When user search is performed
    And user selects first card
    Then verify displayed details with the text
