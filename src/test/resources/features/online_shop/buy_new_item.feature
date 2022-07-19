#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#Sample Feature Definition Template
@regression
Feature: Buy new item in PlazaVea

  Rule: As an online customer, I need to search for products, so that I can find the ones I want to buy.

  @buy_new_item
  Scenario Outline: Search and add a new item to the cart
    Given Online user navigates to PlazaVea home page
    When they look for a new <item>
    And they add new item to the cart
    Then they validate item stored in the cart

    Examples:
      | item |
      |   1  |
      |   2  |