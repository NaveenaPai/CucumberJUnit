package stepdefinitions;

import java.util.List;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class TestExamplesStepDefinitions extends DriverFactory  {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition(DataTable dataTable) {
		logger.info("Test started for  i_want_to_write_a_step_with_precondition");
		List<List<String>> datas = dataTable.asLists(String.class);
		
		for(List<String> data:datas)
		{
			String data1=data.get(0),data2=data.get(1),data3=data.get(2);
			System.out.println(data1+":"+data2+":"+data3);
			logger.info("Test successful for  i_want_to_write_a_step_with_precondition :-> "+data1+":"+data2+":"+data3);
		}
	}

	@When("I complete action")
	public void i_complete_action() {
		logger.info("Test started for i_complete_action");
		System.out.println("i_complete_action");
		logger.info("Test successful for i_complete_action ");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		logger.info("Test started for i_validate_the_outcomes");
		System.out.println("i_validate_the_outcomes");
		logger.info("Test successful for i_validate_the_outcomes");
	}

	@Given("I want to write a step with precondition2")
	public void i_want_to_write_a_step_with_precondition2() {
		logger.info("Test started for i_want_to_write_a_step_with_precondition2");
		System.out.println("i_want_to_write_a_step_with_precondition2");
		logger.info("Test successful for i_want_to_write_a_step_with_precondition2");
	}

	@When("I complete action2")
	public void i_complete_action2() {
		logger.info("Test started for i_complete_action2");
		System.out.println("i_complete_action2");
		logger.info("Test successful for i_complete_action2");
	}

	@Then("I validate the outcomes2")
	public void i_validate_the_outcomes2() {
		logger.info("Test started for i_validate_the_outcomes2 ");
		System.out.println("i_validate_the_outcomes2");
		logger.info("Test successful for i_validate_the_outcomes2");
	}

	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String name) {
		logger.info("Test started for i_want_to_write_a_step_with input "+name);
		System.out.println("i_want_to_write_a_step_with"+name);
		logger.info("Test successful for  i_want_to_write_a_step_with "+name);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer value) {
		logger.info("Test started for i_check_for_the_in_step with input"+value);
		System.out.println("i_check_for_the_in_step"+value);
		logger.info("Test successful for i_check_for_the_in_step with input"+value);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String status) {
		logger.info("Test started for i_verify_the_in_step with input "+status);
		System.out.println("I verify the {string} in step"+status);
		logger.info("Test successful for i_verify_the_in_step with input "+status);
		
	}

}
