@basket
Feature: Basket
  As a user
  I want to add product to basket
  So that i can view later


  @add
  Scenario: Add to Basket
    Given I am on homepage
    When I hover to "Lighting" in the header
    And I click on header sub-option "Table Lamps"
    And I am on results page
    And I select any product
    And I go to basket
    Then I should see selected product in basket


  @remove
  Scenario: Remove product from Basket
    Given I am on homepage
    When I hover to "Lighting" in the header
    And I click on header sub-option "Table Lamps"
    And I am on results page
    And I select any product
    And I go to basket
    And I should see selected product in basket


