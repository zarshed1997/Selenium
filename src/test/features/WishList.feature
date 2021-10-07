Feature: Wish List
  Scenario: Customer able to use WishList
    Given Customer is on DemoShop home page book
    When Customer search for a book
    Then Customer is on search page
    When Click on book
    When Click on add to wishlist
    Then wishlist cart should get updated (0) to (1)

