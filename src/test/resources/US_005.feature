@smoke

Feature: As a visitor, I should be able to verify that I can create a registration from the 'Registration' section

  Scenario: As a visitor, when I click the Register button, it should redirect the visitor to the registration page
    * User goes to URL
    * User clicks sign up
    * User verifies register page show up
    * The users close the page.

    Scenario:As a visitor, when I enter the information and click the Register button, it should redirect to the registration confirmation page
      * User goes to URL
      * User clicks sign up
      * User fills in the registration information and click register
      * The users close the page.