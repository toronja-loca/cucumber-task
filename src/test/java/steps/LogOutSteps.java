package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class LogOutSteps extends TestBase {

    @Before
    public void initialisation(){
        start();
    }

    @After
    public void close(){
        finish();
    }

    @Given("User successful register")
    public void userSuccessfulRegister() {
        basePage.open();
        loginPage.enterLogin("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.logIn();
    }

    @Then("User click navbar button")
    public void userClickNavbarButton() {
        listPage.clickNavBar();
    }

    @And("User log out")
    public void userLogOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        listPage.clickLogOut();
        Assert.assertEquals("url should be different",basePage.getUrl(), "https://www.saucedemo.com/");
    }


}
