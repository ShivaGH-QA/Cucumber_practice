package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/cucumber/java/practice"},
		//features = {"src/test/resources/com/cucumber/java/practice/login_tags.feature"},
		glue={"glue_files","myHooksPkg"},
		plugin= {"pretty"}
		//dryRun= true,
		//monochrome=true
		
		)

public class execution {

}

