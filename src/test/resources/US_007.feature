@smoke
Feature: As a user, I should be able to verify that I can order and delete products by going to 'My Cart'

  Scenario: As a user, when I click on the 'My Cart' button, it should redirect me to the Cart page
    * User goes to URL
    * User enters registration information by clicking Login
    * User clicks Cart button
    * User verifies redirect to Cart Page
    * The users close the page.
    Scenario: As a user, I should be able to decrease, increase or delete items in my cart
      * User goes to URL
      * User enters registration information by clicking Login
      * User adds items to Cart
      * User after go to the Cart page verifies can decrease , increase or delete items in cart
      * The users close the page.
