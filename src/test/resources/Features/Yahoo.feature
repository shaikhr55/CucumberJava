Feature: Create new account on website

  Scenario: Check login successfully with new user
    Given user is on main page
    When user click on login 
    And user click on create an account
    And enter details
    Then account successfully created
