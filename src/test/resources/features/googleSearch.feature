
Feature: Google search functionality

  Agile story: As a user, when I am on the google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search page title verification
    When user is on google search page
    Then user should see title is Google

  @wip
  Scenario:Search functionality result title verification
    Given user is on google search page
    When user types "elma" and clicks enter
    Then user sees "elma" in the google title
