Feature: Search

  @search
  Scenario: Remove product from Basket By search
    Given I am on homepage
    When I search for a product
    And I click on search button
    And I am on results page
    And I select any product
    And I add to basket
    And I should see selected product in basket
    And I have to remove product from basket