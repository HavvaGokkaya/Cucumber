package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/ParalelReport3.html",
                "json:target/json-reports/ParalelReport3.json",
                "junit:target/xml-report/ParalelReport3.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@bam",
        dryRun = false
)
public class ParalelRunner3 {
}
