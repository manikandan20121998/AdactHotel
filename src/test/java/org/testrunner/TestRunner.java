package org.testrunner;

import org.base.JVMReports;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",monochrome=true,
dryRun=false,tags="@E2E",
plugin= {"pretty",
		"pretty:prettyrep.txt",
		"usage:usage.txt",
		"html:src\\test\\resources\\Reports\\Htmlreport",
        "json:src\\test\\resources\\Reports\\jsonreport\\jsonrep.json",
        "junit:src\\test\\resources\\Reports\\junitreport\\junitrep.xml",
        "rerun:src\\test\\resources\\FailedScenario\\failed.txt"}
                              )
public class TestRunner{
	@AfterClass
	public static void Report() {

		JVMReports.generateJVMReportss("src\\test\\resources\\Reports\\jsonreport\\jsonrep.json");
	}

}
