Feature: AddYourReview
  @smoke
  Scenario: Verify Costumer able to add review
    Given Customer is on DemoShop home page
    When Customer clicks on log in
    Then Customer should land on sign in page

    When Customer enters email
    When Customer enters valid password
    When Customer click to remember me
    When Customer click on log in
    Then Customer should see log out


    When Customer search for a book
    Then Customer is on search page

    When Customer click to book
    And Click to add your review
    Then Verify Costumer is on Write your own review page


    When Costumer adding Review title
    When Costumer adding Review text
    When Costumer choosing Rating radio button
    And  Costumer submit review
    Then Verify Product review is successfully added