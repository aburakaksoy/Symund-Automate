package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDefinitions {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @Given("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String string, String string2) {
        BrowserUtils.waitForPageToLoad(3);
        LoginPage loginPage = new LoginPage();
        loginPage.userInputBox.sendKeys(ConfigurationReader.get("username"));
        BrowserUtils.waitFor(1);
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.get("password"));
        loginPage.loginButton.click();
    }


}
