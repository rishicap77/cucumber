

Feature: search for flights
  I want to use this template for my feature file

  @smoke
  Scenario: verfify flights are displayed
    Given user is on flight screen
    When user fills the details and submits
    Then flights should be displayed
   

 
