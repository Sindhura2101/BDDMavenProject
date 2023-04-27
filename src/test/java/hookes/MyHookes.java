package hookes;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import stepDefinitions.Base;

public class MyHookes extends Base{
	
	//before scenario execution
	@Before
	public void setUp() {
		System.out.println("Launch Application");
	}
	
	//after scenario execution
	@After
	public void tearDown() {
		
		System.out.println("close the browser");
	}
	
	@BeforeStep
	public void takeScreenShot() {
		System.out.println("executes before every step");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("executes after every step");
	}
}
