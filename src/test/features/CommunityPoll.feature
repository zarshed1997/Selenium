Feature: Community poll
  Scenario: Verify only register customer can vote
    Given Customer landed to Demoshop home page
    When Customer click to excellent
    When Customer click to vote
    Then Verify text:Only register Customer can vote
