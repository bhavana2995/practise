package org.made.com;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.made.com.driver.DriverFactory;

public class Hooks extends DriverFactory {


    @Before
    public void setUp() {
        openBrowser();
    }

    @After
    public void tearDown() {
       //closeBrowser();
    }
}
