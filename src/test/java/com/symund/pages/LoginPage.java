package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {



    @FindBy(id="user")
    public WebElement userInputBox;

    @FindBy(id="password")
    public WebElement passwordInputBox;

    @FindBy(id="submit-form")
    public WebElement loginButton;


}
