Feature: Examples of cucumber data Tables Implementation

  @Table
  Scenario: List of my favorite fruit
    Then user should see your favorite fruits
      | apple  |
      | melon  |
      | chery  |
      | lemon  |
      | orange |
    #selam
