package com.phptravel.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\manik\\eclipse-workspace\\com.phptravel.cucumber\\Features\\phptravel.feature", glue = "stepdefination")
public class Runnerclass {

}
