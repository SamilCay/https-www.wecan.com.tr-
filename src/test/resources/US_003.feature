@smoke

Feature: As a user, I should be able to verify that the elements in the body section of the home page are
         visible and the functions are active, and that I can search in the search section and view the number of results


  Scenario: As a user, I should be able to search using the 'Search' button and verify that I can see the results
    * User goes to URL
    * User enters registration information by clicking Login
    * User types the desired model in the Search box and gets results
    * User confirms that they have been redirected to the results
    * The users close the page.


    Scenario: As a user, I should be able to verify that all functions in the Body section are visible and active
      * User goes to URL
      * User enters registration information by clicking Login
      * User clicks on the Discover Now buttons under Baby Toddler and Kids and confirms that it works and redirects to the correct page
      * user verifies that the Register Free, Get Shipping Info and Return Request buttons work and visible
      * User verifies that images under baby 6-18 months appear and work
      * User verifies that images under toddler-girls 2-13 years appear and work
      * User verifies that images under New Clothings  appear and work
      * User confirms that the color options of the products under New Clothes can be changed, added to the cart and the quantity can be increased
      * User can check that the mobile application buttons below the Wecan logo are visible and operational
      * User verifies that Instagram posts appear and redirect to Wecan Instagram account
      * User verifies Follow Wecan button is visible and working
      * The users close the page.

