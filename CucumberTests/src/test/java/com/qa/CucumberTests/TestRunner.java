package com.qa.CucumberTests;

import org.junit.runner.*;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/qa/CucumberTests/TeaTesting.feature" )
public class TestRunner {

}
