package stepdefinitions;

import java.util.List;
import java.util.Map;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDataTableStepDefinitions extends DriverFactory {

	@Given("I want to write a step with preconditionTest2")
	public void i_want_to_write_a_step_with_precondition_test2(DataTable dataTable) {
		
		logger.info("Test Started for i_want_to_write_a_step_with_precondition_test2");
		System.out.println("i_want_to_write_a_step_with_precondition_test2");
		List<Map<String, String>> datas = dataTable.asMaps();

		String name, value, status;
		for (Map<String, String> data : datas) {
			name = data.get("name");
			value = data.get("value");
			status = data.get("status");
			logger.info("i_want_to_write_a_step_with_precondition_test2: executed for " + name + ":" + value + ":"
					+ status);
			System.out.println(name + ":" + value + ":" + status);

		}
		logger.info("Test successful for i_want_to_write_a_step_with_precondition_test2");
	}

	@When("I complete actionTest2")
	public void i_complete_action_test2() {
		logger.info("Test Started for i_complete_action_test2");
		System.out.println("i_complete_action_test2");
		logger.info("Test successful for i_complete_action_test2");

	}

	@Then("I validate the outcomesTest2")
	public void i_validate_the_outcomes_test2() {
		logger.info("Test started for  i_validate_the_outcomes_test2");
		System.out.println("i_validate_the_outcomes_test2");
		logger.info("Test successful for  i_validate_the_outcomes_test2");
	}

}
