import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Include/features",
glue = "stepsDefinition",
tags = "@LGI001, @LGO002, @LGI003, @LGO004, @LGO005",
//tags = "",
monochrome = true
)

public class Runner {
}
