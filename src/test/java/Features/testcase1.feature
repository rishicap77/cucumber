
Feature: search product funtionality
 

@smoke
  Scenario Outline: verify productname on homepage and on deals are same
    Given user is on greenkart homepage
    When user searches the product with shortname <product> corresponding fullname is displayed
    Then user searches with same shortname <product> on dealspage full productname on deals should match fullname on homepage

 Examples:
 |product|
 |tom|
 |beet|  
