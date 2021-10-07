Feature: RewordPoints
  Scenario:Customer able to see Reward Points
    Given Customer is landed to demo shop home page login
    When Customer clicks on log in
    Then Customer should land on sign in page

    When Customer enters email
    When Customer enters valid password
    When Customer click to remember me
    When Customer click on log in
    Then Customer should see log out

    When Customer click to My account
    Then Customer in on My account page

    When Customer click to Reward tab
    Then Verify my reward is 0.