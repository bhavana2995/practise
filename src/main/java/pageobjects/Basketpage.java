package pageobjects;

import org.made.com.driver.DriverFactory;
import org.openqa.selenium.By;

public class Basketpage extends DriverFactory {


    public String getProductName(){
      return  driver.findElement(By.cssSelector(".quoteItem .product-name a")).getText();
    }
}
