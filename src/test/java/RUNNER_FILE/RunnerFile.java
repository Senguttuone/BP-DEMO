package RUNNER_FILE;

import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions

(features={"src/test/resources/Featurefile/LeadValidation_Status_check_after_WIP_Submission.feature", 
	"src/test/resources/Featurefile/Loginfunctionality.feature","src/test/resources/Featurefile/Dashboardtest.feature",
	"src/test/resources/Featurefile/Lead_Creation.feature", "src/test/resources/Featurefile/WIPLeadUpdate.feature"},

glue={"STEP_DEF"},monochrome= true)

public class RunnerFile { 

}
//"src/test/resources/Featurefile/Loginfunctionality.feature","src/test/resources/Featurefile/Dashboardtest.feature"
//,"src/test/resources/Featurefile/Lead_Creation.feature"
// "src/test/resources/Featurefile/WIPLeadUpdate.feature"
//"src/test/resources/Featurefile/LeadValidation_Status_check_after_WIP_Submission.feature"
//"src/test/resources/Featurefile/LeadValidation_Status_check_after_WIP_Submission.feature"