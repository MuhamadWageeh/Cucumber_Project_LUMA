Feature: LandingPage function
Scenario: Validate That Hot Sellers is displayed and each card contains Price in $
  Given user open a new browser
  And user open a new website url
  When user Scroll Down to Hot Sellers Section
  And user Observe each card is displayed with Price
  Then Each card should display price in dollar

Scenario: Validate That each card contains “Add to Cart” button and clickable
  Given user open a new browser
  And user open a new website url
  When user Scroll Down to Hot Sellers Section
  And user Observe each card contains Add to Cart
  Then Each card should display Add to Cart button and it should be clickable

Scenario: Validate That Guest user can add product to cart
  Given user open a new browser
  And user open a new website url
  When user Scroll Down to Hot Sellers Section
  And user Hover on Card Breathe Easy Tank
  And user Select Size M
  And user Select Color
  And user Click on Add to Cart button
  Then Product should be added to cart successfully
  Then Cart icon should display number 1
