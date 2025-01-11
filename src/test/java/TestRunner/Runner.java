package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = "C:\\Users\\EXTRA\\IdeaProjects\\Amit3\\src\\main\\resources\\Features",
            glue = {"steps"},
            plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

            tags = "@smoke"
    )
    public class Runner extends AbstractTestNGCucumberTests{
}
