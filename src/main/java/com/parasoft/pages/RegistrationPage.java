package com.parasoft.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    //TODO add registration form input boxes' web elements

    @FindBy(id="customer.firstName")
    public WebElement firstName;

    @FindBy(id="customer.lastName")
    public WebElement lastName;

    @FindBy(id="customer.address.street")
    public WebElement address;

    @FindBy(id="customer.address.city")
    public WebElement city;

    @FindBy(id="customer.address.state")
    public WebElement state;

    @FindBy(id="customer.address.zipCode")
    public WebElement zipcode;

    @FindBy(id="customer.phoneNumber")
    public WebElement phone;

    @FindBy(id="customer.ssn")
    public WebElement ssn;

    @FindBy(id="customer.username")
    public WebElement usernameInput;

    @FindBy(id="customer.password")
    public WebElement passwordInput;

    @FindBy(id="repeatPassword")
    public WebElement confirmPasswordInput;

    @FindBy(css="input[value='Register']")
    public WebElement registerButton;

}
