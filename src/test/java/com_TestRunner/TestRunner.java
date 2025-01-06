package com_TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "F:\\Eclipse work space\\BDD-Cucumber-2930\\src\\test\\java\\com_Features\\AdactinLogin.feature",
		glue="com_StepDefination",
		tags = "@Smoke",
		plugin= {"pretty",
				"html:Reports/newreport.html",
				"json:Reports/newreport.json",
				"rerun:target/rerun.txt",    //Mandatory to capture failures
		}
		)

public class TestRunner {

}
