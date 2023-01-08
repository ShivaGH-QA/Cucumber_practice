
  package runner;
  
  import org.junit.runner.RunWith; 
  import cucumber.api.CucumberOptions;
  import io.cucumber.junit.Cucumber;
  
  
  @RunWith(Cucumber.class)
  @CucumberOptions( 
		  //features ={"src/test/resources/com/cucumber/java/practice/tags_login.feature"},
   features ={"classpath:features"},
  	glue= {"glue_files","myHooksPkg"}, 
  	//tags= "@Smoke",
  	plugin={"pretty"} 
  	)
  
  public class execution_tags {
  
  }
 
