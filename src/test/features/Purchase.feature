Feature: Guest Custumer purchase
  @SmokeTest
  Scenario:A books purchase
    Given Customer landed to Demoshop home page
    When Custumer Clicks on books
    Then Custumer should see the books hearer


    When Custumer changes sort by low to high
    When Custumer adds the first book to cart
    Then custumer shoukd see update cart

    When Custumer clicks on cart
    Then Custumer should land on shopping cart paga

    When Custumer agrees to term and conditions
    When Custumer click on checkout
    Then Custumer should be redirected to Sign-in paga

    When Custumer click on check-out-as-guest bnutton
    Then Custumer is redirected to checkout




    When Custumer enters first name
    And Custumer enter fist name
    And Custumer enters last name
    And Custumer enters email
    And custumer chooses a country
    And Custumer enters city
    And Custumer enters address
    And Custumer enters zipcode
    And Custumer enters phone
    And Custumer click on continue


    When Customer clicks on pick-up in store checkbox
    And  Customer clicks on continue button
    When Custumer clicks on continue button
    When Custumer click on payment method continue
    When Customer slicks on payment info continue
    When Custumer click on confirm continue
    Then Order number is generated


