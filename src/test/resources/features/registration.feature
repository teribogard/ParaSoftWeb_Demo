Feature: As a user I should be able to register

  @wip @registration
  Scenario: As a user I should be able create an account
# steps for registration process starting from the link below
  #https://parabank.parasoft.com/parabank/register.htm
  Given user is on the registration page
    And user clicks enters account information
    And user enters username and password
    And user clicks Register button
    Then user sees message "Your account was created successfully. You are now logged in."
    #username and password will taken from configuration properties file

