
Feature: Examples of cucumber data Tables Implementation

  Scenario: List of my favorite fruit
    Then user should see your favorite fruits
      | apple  |
      | melon  |
      | chery  |
      | lemon  |
      | orange |
    #selam





  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    When user enters user name "Test"
    And user enters user password "Tester"
    And user clicks to login button
    Then user should see url contains orders


  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |