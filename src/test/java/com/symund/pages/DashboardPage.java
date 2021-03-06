package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(css=".avatardiv.avatardiv-shown")
    public WebElement avatarIcon;

    @FindBy(partialLinkText = "Log out")
    public WebElement logoutButton;



}
