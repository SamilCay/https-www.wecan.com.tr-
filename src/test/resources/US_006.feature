@smoke

Feature: As a user, I should be able to verify that the 'My Account', 'Orders' and
        'Secure Checkout' Functions in the area with my username are working correctly


  Scenario: I must be able to verify that I can successfully log in to my account as a user
    * User goes to URL
    * User enters registration information by clicking Login
    * User verifies successfully login
    * The users close the page.

    Scenario: As a user, when I click on the button labeled Account, my information should be updated when I change my information and click 'Update'.
      * User goes to URL
      * User enters registration information by clicking Login
      * User click Account
      * Changes the user information and presses the Update button
      * The users close the page.

      Scenario: As a user, when I click on the Orders button, it should direct me to the page with my orders
        * User goes to URL
        * User enters registration information by clicking Login
        * User clicks the Orders button under the username
        * User verifies redirect the orders page
        * The users close the page.

        Scenario: As a user, I should be able to successfully log out of the site when I click Secure Logout
          * User goes to URL
          * User enters registration information by clicking Login
          * User clicks  Secure Logout and verifies successfully log out
          * The users close the page.