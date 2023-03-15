package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/ParalelReport1.html",
                "json:target/json-reports/ParalelReport1.json",
                "junit:target/xml-report/ParalelReport1.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false
)
public class ParalelRunner1 {
}
