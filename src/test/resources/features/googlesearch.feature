Feature: Google search functionality

  Agile story: As a user, when I am on the google search page
  I should be able to search whatever I want and see relevant information

  @google
  Scenario: Search page title verification
    When user is on google search page
    Then user should see title is Google