package org.made.com.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.*;

public class BasketSteps {

    Homepage homepage = new Homepage();
    Resultpage resultpage = new Resultpage();
    Basketpage basketpage = new Basketpage();
    DeliveryContactpage deliveryContactpage = new DeliveryContactpage();
    ProductDescPage productDescPage = new ProductDescPage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

        Assert.assertTrue(homepage.isOnHomePage());
    }

    @When("^I hover to \"([^\"]*)\" in the header$")
    public void i_hover_to_in_the_header(String headerItems) {

        homepage.hoverToHeader(headerItems);
    }

    @When("^I click on header sub-option \"([^\"]*)\"$")
    public void i_click_on_header_sub_option(String subHeaderItem) {

        homepage.clickSubitemsFromHeader(subHeaderItem);
    }

    @When("^I search for a product$")
    public void i_search_for_a_product() {
        homepage.searchForProduct();
    }

    @When("^I click on search button$")
    public void i_click_on_search_button() {
        homepage.clickOnSearchButton();
    }

    @Then("^I am on results page$")
    public void iAmOnResultsPage() {
        resultpage.isOnResutlsPage();
        String expected = "Search results for 'Double Beds'";
//        String actual = resultpage.isOnResutlsPage();
//       Assert.assertEquals(expected, actual);
//        Assert.assertTrue(actual.equalsIgnoreCase(expected));
    }

    @When("^I select any product$")
    public void iSelectAnyProduct() throws InterruptedException {
        resultpage.selectAnyProduct();
    }

    @And("^I add to basket$")
    public void iGoToBasket() {
        productDescPage.clickOnAddToBasket();
    }

    @Then("^I should see selected product in basket$")
    public void iShouldSeeSelectedProductInBasket() {
        String actual = basketpage.getProductName();
        String expected = Resultpage.selectedProductName;

        Assert.assertEquals(expected, actual);
        Assert.assertTrue(actual.equalsIgnoreCase(expected));
    }

    @When("^I have to remove product from basket$")
    public void i_have_to_remove_product_from_basket() {
        basketpage.removeProductFromBasket();
    }


    @And("^I add any (\\d+) product to basket$")
    public void iAddAnyProductToBasket(int numberOfproducts) {
        resultpage.addProductsToBasket(numberOfproducts);
    }

    @And("^I remove  a product from basket$")
    public void iRemoveAProductFromBasket() {
        basketpage.removeProductFromBasket();
    }

    @Then("^I should see that product deleted$")
    public void iShouldSeeThatProductDeleted() {
        boolean condition = basketpage.verifyIsProductDeleted().contains(Basketpage.deletedProductName);
        Assert.assertFalse(condition);
    }
}
