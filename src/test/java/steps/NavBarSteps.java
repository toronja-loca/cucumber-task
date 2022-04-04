package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.concurrent.TimeUnit;

public class NavBarSteps extends TestBase{
    @Before
    public void initialisation(){
        start();
    }

    @After
    public void close(){
        finish();
    }

    @Given("user succesful register")
    public void userSuccesfulRegister() {
        basePage.open();
        loginPage.fillFields();
    }

    @And("user click navbar button")
    public void userClickNavbarButton() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        listPage.clickNavBar();
    }

    @Then("user close navbar")
    public void userCloseNavbar() {
        listPage.closeNavbar();
    }

}
