Feature: Login function
Scenario: user can login with registered email and password
  Given user open new browser
  And user open new website url
  When user click on sign in
  And user enters vaild email
  And user enters vaild password
  And user click on sign in button
  Then User navigated to homepage
  Then welcome message should be displayed
