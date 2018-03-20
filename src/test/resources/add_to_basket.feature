Feature: Basket
  As a user
  I want to add product to basket
  So that i can view later

  Scenario: Add to Basket
    Given I am on homepage
    When I hover to "Beds" in the header
    When I click on header sub-option "Single Beds"
    Then I am on results page
    When I select any product