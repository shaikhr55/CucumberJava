Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given Browser is open
    When user enters a text in search box
    And hits enter
    Then user is navigate to search results
