
Feature: Wikipedia Search Functionality

  @Wiki
  Scenario:Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    Then User clicks wiki search button
    And User sees "Steve Jobs" is in the wiki title

  Scenario:Wikipedia Search Functionality Header Verification
   Given User is on Wikipedia home page
   When User types "Steve Jobs" in the wiki search box
   Then User clicks wiki search button
   And User sees "Steve Jobs" is in the main header
