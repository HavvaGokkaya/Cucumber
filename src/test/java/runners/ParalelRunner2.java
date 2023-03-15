package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/ParalelReport2.html",
                "json:target/json-reports/ParalelReport2.json",
                "junit:target/xml-report/ParalelReport2.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@ss",
        dryRun = false
)
public class ParalelRunner2 {
}
