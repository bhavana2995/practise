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

    @Then("^I am on results page$")
    public void iAmOnResultsPage() {
        Assert.assertTrue(resultpage.isOnResutlsPage());
    }

    @When("^I select any product$")
    public void iSelectAnyProduct() {
        resultpage.selectAnyProduct();
    }

    @And("^I go to basket$")
    public void iGoToBasket() {
        productDescPage.clickOnAddToBasket();
    }

    @Then("^I should see selected product in basket$")
    public void iShouldSeeSelectedProductInBasket() {
        String actual = basketpage.getProductName();
        String expected = Resultpage.selectedProductName;

        Assert.assertEquals(expected,actual);
        Assert.assertTrue(actual.equalsIgnoreCase(expected));
    }
}
