package pageobjects;

import org.junit.Assert;
import org.made.com.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage extends DriverFactory {

    public boolean isOnHomePage() {
        String url = driver.getCurrentUrl();
        return url.endsWith("made.com/");
    }


    public void hoverToHeader(String item) {
        List<WebElement> headers = driver.findElements(By.cssSelector(".nav__primarylink .nav__itemtitle"));
        for (WebElement header : headers) {
            if (header.getText().equalsIgnoreCase(item)) {
                actions.moveToElement(header).build().perform();
                break;
            }
        }
    }

    public void clickSubitemsFromHeader(String subItem) {
        List<WebElement> subNavItems = driver.findElements(By.cssSelector(".subnav__itemtext"));

        for (WebElement subNavItem:subNavItems){
            if(subNavItem.getText().equalsIgnoreCase(subItem)){
                subNavItem.click();
                break;
            }
        }
    }
}
