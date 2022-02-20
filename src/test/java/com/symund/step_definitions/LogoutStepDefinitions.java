package com.symund.step_definitions;

import com.symund.pages.DashboardPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefinitions {

    @Given("the user on the dasboard page")
    public void theUserOnTheDasboardPage() {
        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals("verify the dashboard url","https://qa.symund.com/index.php/apps/dashboard/",currentUrl);

    }


    @And("the user opens the user avatar on the top right-hand corner and clicks on logout button")
    public void theUserOpensTheUserAvatarOnTheTopRightHandCornerAndClicksOnLogoutButton() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.avatarIcon.click();
        dashboardPage.logoutButton.click();


    }

    @And("verify that the user ends up in the login page")
    public void verifyThatTheUserEndsUpInTheLoginPage() {
        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals("verify the login page url","https://qa.symund.com/index.php/login?clear=1",currentUrl);

    }

    @When("the user navigates back to the homepage")
    public void theUserNavigatesBackToTheHomepage() {
        BrowserUtils.waitFor(2);
        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
    }

    @Then("verify that user can not go to home page again after logged out")
    public void verifyThatUserCanNotGoToHomePageAgainAfterLoggedOut() {
        Assert.assertNotEquals("verify the url","https://qa.symund.com/index.php/apps/dashboard/","https://qa.symund.com/index.php/login?clear=1");
    }
}
