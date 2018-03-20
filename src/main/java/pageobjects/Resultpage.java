package pageobjects;

import org.junit.Assert;
import org.junit.Test;
import org.made.com.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Resultpage extends DriverFactory {
    public static String selectedProductName;

    public boolean isOnResutlsPage() {
        return driver.findElement(By.cssSelector("#narrow-by-list")).isDisplayed();
    }

    public void selectAnyProduct() {
        List<WebElement> productsNames = driver.findElements(By.cssSelector(".product-name>a"));
        int numberOfProducts = productsNames.size();
        Random random = new Random();
        int randomNumber = random.nextInt(numberOfProducts);
        selectedProductName = productsNames.get(randomNumber).getText();
        productsNames.get(randomNumber).click();

        System.out.println("random number " + randomNumber);
        System.out.println("Product selected is : " + selectedProductName);

    }

}
