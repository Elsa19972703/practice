
Feature: calculator
  I want calculator to perform addition

  Scenario Outline: addition of two numbers
    Given I want to add two numbers 
    When I add <number1> and <number2>
    Then I get the result as  <result> 

    Examples: 
      | number1  | number2 | result  |
      |    12    |    24   |    36   |
      |     5    |     7   |    12   |
      |     9    |     5   |    14   |