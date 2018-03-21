package pageobjects;

import org.made.com.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Basketpage extends DriverFactory {

    public static String deletedProductName;

    public String getProductName() {
        return driver.findElement(By.cssSelector(".quoteItem .product-name a")).getText();
    }

    public void removeProductFromBasket() {
        driver.findElement(By.cssSelector(".removeQi")).click();
    }


    public void removeAnyProducts() {
        int i = 0;
        List<WebElement> productsInBasketElement = driver.findElements(By.cssSelector(".row-name .product-name a"));
        deletedProductName = productsInBasketElement.get(i).getText();
        productsInBasketElement.get(i).click();
        driver.findElements(By.cssSelector(".removeQi")).get(i).click();
    }

    public List<String> verifyIsProductDeleted() {
        List<String> listOfProducts = new ArrayList<>();

        List<WebElement> productsInBasketElement = driver.findElements(By.cssSelector(".row-name .product-name a"));
        for (WebElement products : productsInBasketElement) {
            listOfProducts.add(products.getText());
        }
        return listOfProducts;
    }
}
