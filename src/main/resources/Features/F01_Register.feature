Feature: Register function
Scenario: user cannot register with invalid credential
  Given user open browser
  And user open website url
  When user Click on Create an Account
  And user enters first name
  And user enters last name
  And user enters email
  And user enters password
  And user Click on Create an Account button
  Then User navigated to  create an account page
  Then error message will be displayed

  Scenario: user cannot register with invalid credential
    Given user open browser
    And user open website url
    When user Click on Create an Account
    And user enters first name
    And user enters last name
    And user enters email
    And user enters password
    And user enters Confirm Password does not match Password
    And user Click on Create an Account button
    Then User navigated to  create an account page
    Then Please enter the same value again error will be displayed

  Scenario: user register with valid credential
    Given user open browser
    And user open website url
    When user Click on Create an Account
    And user enters first name
    And user enters last name
    And user enters email
    And user enters password
    And user enters Confirm Password match Password
    And user Click on Create an Account button
    Then User navigated to customer account page
    Then In Contact Information user data is the same as user input during registration