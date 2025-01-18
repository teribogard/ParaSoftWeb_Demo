package com.parasoft.pages;

import com.parasoft.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
