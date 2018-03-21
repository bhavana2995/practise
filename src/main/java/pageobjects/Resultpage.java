package pageobjects;

import org.made.com.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Resultpage extends DriverFactory {
    public static String selectedProductName;

    public static List<String> listOfProductsAdded = new ArrayList<>();


    public boolean isOnResutlsPage() {
        return driver.findElement(By.cssSelector("#narrow-by-list")).isDisplayed();
//      return driver.findElement(By.cssSelector(".category-title.col-xs-24>h1")).getText();
    }

    public void selectAnyProduct() {
        sleep(3000);
        List<WebElement> productsNames = driver.findElements(By.cssSelector(".product-name>a"));
        int numberOfProducts = productsNames.size();
        int randomNumber = randomNumber(numberOfProducts);
        selectedProductName = productsNames.get(randomNumber).getText();
        productsNames.get(randomNumber).click();
    }

    public void addProductsToBasket(int numberOfproducts) {
        sleep(3000);
        for (int i = 0; i < numberOfproducts; i++) {

            List<WebElement> productsNames = driver.findElements(By.cssSelector(".product-name>a"));
            int numberOfProducts = productsNames.size();
            sleep(3000);
            int randomNumber = randomNumber(numberOfProducts);
            listOfProductsAdded.add(productsNames.get(randomNumber).getText());
            productsNames.get(randomNumber).click();
            new ProductDescPage().clickOnAddToBasket();

            if (listOfProductsAdded.size() == numberOfproducts) {
                break;
            }
            driver.navigate().back();
            driver.navigate().back();


        }

    }
}
