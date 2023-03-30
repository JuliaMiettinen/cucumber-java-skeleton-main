package io.cucumber.skeleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature_example_steps {
    private int num1;
    private int num2;
    private int total;

    @Given("I input two numbers into the calculator")
public void i_input_two_numbers_into_the_calculator() {
    num1=2;
    num2=3;
}
@When("I press add")
public void i_press_add() {
    total = num1+num2;
    System.out.println(total);
}
@Then("I should get the result on the screen")
public void i_should_get_the_result_on_the_screen() {
    assertEquals(5, total);
}
    
}
