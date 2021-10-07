Feature: Adding to cart
  Scenario: Add a health book to cart


    Given Customer is on DemoShop home page book
    When Customer search for a book
    Then Customer is on search page

    When Customer clicks to add to cart
    Then shopping cart should get updated (0) to (1)

