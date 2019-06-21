package Runner;

/*package Runner;*/

//import com.cucumber.listener.Reporter;
import java.io.File;
//import com.vimalselvam.cucumber.listener.*;
import org.junit.AfterClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

    //Testrunner has the reference of feature file,step definition path and html report.
	//Report of the same can found under Target/Cucumberreports/index.html

@RunWith(Cucumber.class)
@CucumberOptions(features ="./src/test/java/HomelncalcFeatures" , 
	glue = {"HomelncalcStepdefinition" },
    tags = { "@SmokeTest"}, 
    plugin = { "pretty", "html:target/Cucumberreports" },
    monochrome = true
		)


public class TestRunner {

	
	}


	
	
	
