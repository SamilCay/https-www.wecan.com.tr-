@smoke

Feature: As a visitor I should be able to verify that I can view that the menus in the header section of the Home page are visible and active

  Scenario: The menus in the header section of the Home page should be visible and active for a visitor
    * User goes to URL
    * User confirms Help, Login, Register, Russian, English, Turkish and Search buttons visible and active
    * User clicks on the language options and confirms that the languages have changed
    * User click the help button and is redirected
    * The user clicks the Login and Register buttons and is redirected

