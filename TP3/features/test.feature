Feature: Cucumber Example

  Scenario Outline: Eating cucumbers
      Given I have "<cucumbers>" cucumbers 
      When I eat "<less>" cucumbers
      Then I should have "<total>" cucumbers left

    Examples:
      | cucumbers | less | total |
      | 5         | 3    | 2     |
      | 10        | 10   | 0     |
      | 38        | 3    | 35    |