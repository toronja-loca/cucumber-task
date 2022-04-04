package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ChoiceOneItemAndBackToMainPage extends TestBase {

    @Before
    public void initialisation(){
        start();
    }

    @After
    public void close() {
        finish();
    }

    @Given("user on the main page after successfull register")
    public void userOnTheMainPageAfterSuccessfullRegister() {
        basePage.open();
        loginPage.fillFields();
    }

    @And("user choice backpack on the main page")
    public void userChoiceBackpackOnTheMainPage() {
        listPage.choiceBackPack();
    }

    @And("user add backpack to  bucket")
    public void userAddBackpackToBucket() {
        itemPage.clickToItem();
        itemPage.addItemToCart();
    }

    @Then("user return to main page")
    public void userReturnToMainPage() {
        itemPage.backToProd();
    }

    @Then("user see number of items in the basket is one")
    public void userSeeNumberOfItemsInTheBasketIsOne() {
        Assert.assertEquals(1, listPage.getShoppingCartQuantity());
    }
}
