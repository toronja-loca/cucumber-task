package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.concurrent.TimeUnit;

public class IconSteps extends TestBase {

    @Before
    public void initialisation(){
        start();
    }

    @After
    public void close() {
        finish();
    }

    @Given("user on the main page after register")
    public void userOnTheMainPageAfterRegister() throws InterruptedException {
        basePage.open();
        loginPage.fillFields();
        TimeUnit.SECONDS.sleep(1);
    }

    @And("user scroll page down")
    public void userScrollPageDown() {
        basePage.scrollPage(300);
    }

    @Then("user see facebook icon")
    public void userSeeFacebookIcon() {
        listPage.checkSocialFacebookIsDisplayed();
    }

    @Then("user see linkedin icon")
    public void userSeeLinkedinIcon() {
        listPage.checkSocialLinkedInIsDisplayed();
    }

    @Then("user see twitter icon")
    public void userSeeTwitterIcon() {
        listPage.checkSocialTwitterIsDisplayed();
    }
}
