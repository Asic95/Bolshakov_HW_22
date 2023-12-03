package Exercise_33;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Exercise_3.1/myStudent.feature", glue = "StudentsStep")
public class RunCucumberTest {
}
