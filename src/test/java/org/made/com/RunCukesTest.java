package org.made.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * this is sample code
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", dryRun = false)
public class RunCukesTest {
}
