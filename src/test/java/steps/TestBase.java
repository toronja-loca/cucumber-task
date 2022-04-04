package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.InventoryListPage;
import pages.ItemPage;
import pages.LoginPage;

public class TestBase {
    protected static WebDriver driver;

    public BasePage basePage;
    public LoginPage loginPage;
    public InventoryListPage listPage;
    public ItemPage itemPage;

    public void start() {
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        basePage = PageFactory.initElements(driver, BasePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        listPage = PageFactory.initElements(driver,InventoryListPage.class);
        itemPage =PageFactory.initElements(driver,ItemPage.class);
    }

    public void finish() {
        driver.quit();
    }

}
