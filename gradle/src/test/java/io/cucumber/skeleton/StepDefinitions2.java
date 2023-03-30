package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions2 {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    @When("I wait {int} hour")
public void i_wait_hour(Integer int1) {
    System.out.println("Wait 1 hour success");
}
@Then("my belly should growl")
public void my_belly_should_growl() {
    System.out.println("Belly growl success");
}
}
