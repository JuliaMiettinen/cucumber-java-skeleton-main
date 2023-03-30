package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given ("user is on Application landing page")
    public void userIsOnApplicationLandingPage () {
        System.out.println("User is on application page");
    }
    @When ("user enters {string} in username field")
    public void userEntersInUsernameField (String arg0){
        System.out.println("The arg is = " + arg0);
    }
    @Then ("user is successfully registered")
    public void userIsSuccessfullyRegistered (){
        System.out.println("Registration successful");
    }
}
