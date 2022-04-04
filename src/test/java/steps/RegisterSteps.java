package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RegisterSteps extends TestBase{
    @Before
    public void initialisation(){
        start();
    }

    @After
    public void close(){
        finish();
    }

    @Given("User open register page")
    public void userOpenRegisterPage() {
        basePage.open();
    }

    @Given("User enter correct login and password")
    public void userEnterCorrectLoginAndPassword() {
        loginPage.enterLogin("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.logIn();
    }

    @Then("User sees main page")
    public void userSeesMainPage() {
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", basePage.getUrl());
    }
}
