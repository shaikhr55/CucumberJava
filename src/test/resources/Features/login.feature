Feature: feature to test functionality

  Scenario: Check login is successful with valid credential
    Given user is on login page
    When user enter username and password
    And cliks on login button
    Then user is navigated to the home page

  #Scenario Outline: Check login is successful with valid credential
    #Given user is on login page
    #When user enter <username> and <password>
    #And cliks on login button
    #Then user is navigated to the home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass123  |
      #| user2    | pass34   |
      #| user3    | pass54   |
