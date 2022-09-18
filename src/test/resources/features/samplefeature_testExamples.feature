@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
     When I complete action
    Then I validate the outcomes

 @tag1
  Scenario: Title of your scenario2
    Given I want to write a step with precondition2
    When I complete action2
    Then I validate the outcomes2
    
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with '<name>'
    When I check for the <value> in step
    Then I verify the '<status>' in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
