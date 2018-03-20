package pageobjects;

import org.junit.Assert;
import org.made.com.driver.DriverFactory;
import org.openqa.selenium.By;

public class ProductDescPage extends DriverFactory {

    public void clickOnAddToBasket(){
        driver.findElement(By.cssSelector(".js-add-to-basket")).click();
    }


}
