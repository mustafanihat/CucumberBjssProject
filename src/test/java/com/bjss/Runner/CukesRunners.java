package com.bjss.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com/bjss/stepDefinitions",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunners {



}
