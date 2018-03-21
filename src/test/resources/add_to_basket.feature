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
    And I add to basket
    Then I should see selected product in basket


  @remove
  Scenario: Remove product from Basket
    Given I am on homepage
    When I hover to "Beds" in the header
    And I click on header sub-option "Double Beds"
    And I am on results page
    And I select any product
    And I add to basket
    And I should see selected product in basket
    And I have to remove product from basket


  @remove3
  Scenario: Remove product from Basket
    Given I am on homepage
    When I hover to "Beds" in the header
    And I click on header sub-option "Double Beds"
    And I am on results page
    And I add any 3 product to basket
    And I remove  a product from basket
    Then I should see that product deleted

