package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Java Selenium\\CucumberFramework\\CucumberPOMConcepts\\src\\main\\java\\com\\qa\\features\\login.feature"
		, glue={"com.qa.stepDefinition"}
		, dryRun = false  // check the mapping between features file and step definition
		, monochrome = true // generate proper readable console 
		,strict = true  // checks if any steps is not defined in step definition file 
		, plugin = {"pretty","html:html_output/cucumber.html" ,"json:json_output/cucumber.json" , "junit:junit_xml/cucumber.xml"}// generates reports
		//,tags = {"~@End2End","~@SmokeTest","~@RegressionTest","~@FunctionalTest"}
		)

public class TestRunner {

}
