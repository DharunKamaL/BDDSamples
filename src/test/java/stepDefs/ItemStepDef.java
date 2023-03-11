package stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.When;

public class ItemStepDef {

	@BeforeAll
	public void readDatafromDB() {
		System.out.println("BeforeALLScenarios...");
	}
	
	@Before
	public void launchingBrowser() {
		System.out.println("BeforeEachScenario...");
	}
	
	@When("User create a new item")
	public void user_create_a_new_item() {
	   System.out.println("User create a new item");
	}
	
	@When("User updates an item")
	public void user_updates_an_item() {
		System.out.println("User update a new item");
	}
	
}
