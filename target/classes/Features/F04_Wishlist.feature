Feature: WishList function
Scenario: Validate that Guest user can’t add any product to Wishlist
  Given user open another browser
  And user open another website url
  When user Scroll Down to A Hot Sellers Section
  And user Hover on any card and click on Add to Wishlist button
  Then User should be navigated to login page again

 Scenario: Validate That Logged in user can add any product to Wishlist
   Given user open another browser
   And user open another website url
   When  User logging in
   And user Scroll Down to A Hot Sellers Section
   And user Hover on any card and click on Add to Wishlist button
   Then User should be navigated to My Wishlist page with the same product
