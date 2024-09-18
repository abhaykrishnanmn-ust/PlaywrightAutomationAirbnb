Feature: Validate stays functionalities

  Scenario: Verify searching destination for stays functionality
    Given user opens website
    And verify user is on homepage
    When user clicks on where
    Then user selects destination by "region"
    And select check in and check out date
    And select number of people
    When user click on search button
    Then verify searched page is displayed
    When user selects first card
    Then verify displayed details with the input details

  Scenario: Verify distribution and total price
    Given user opens website
    And verify user is on homepage
    When user clicks on where
    Then user selects destination by "region"
    And select check in and check out date
    And select number of people
    When user click on search button
    Then verify searched page is displayed
    When user selects any card
    Then verify the price distribution is equals total price