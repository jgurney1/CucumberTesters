package com.qa.CucumberTests2;

import org.junit.runner.*;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/qa/CucumberTests2/Parametisation.feature" )
public class TestRunner {

}
