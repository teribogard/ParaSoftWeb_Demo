package com.parasoft.step_definitions;

import com.parasoft.utils.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Registration {

    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {
        //TODO navigate to registration page
    }
    @Given("user clicks enters account information")
    public void user_clicks_enters_account_information() {
        //TODO fill the registration form

    }
    @Given("user enters username and password")
    public void user_enters_username_and_password() {
        //get username and password from configuration.properties
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        // TODO enter username, password to input boxes
    }
    @Given("user clicks Register button")
    public void user_clicks_register_button() {

    }
    @Then("user sees message {string}")
    public void user_sees_message(String confirmationMessage) {

    }
}
