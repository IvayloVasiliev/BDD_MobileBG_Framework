package stepDefenitions;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import pages.BasePage;

public class CommonSteps {
    protected static Logger log = LogManager.getLogger(CommonSteps.class);
    protected TestContext context;
    protected BasePage basePage;

    public CommonSteps(TestContext context) {
        this.context = context;
        basePage = new BasePage(context.driver);
    }

    @Given("I navigate to {string} page")
    public void i_navigate_to_page(String page) {
        basePage.navigateToPage(page);
    }
    @When("I click on {string} tab")
    public void iClickOnTab(String tabName) {
        basePage.clickOnTab(tabName);
    }

    @And("I click on {string} button")
    public void iClickOnButton(String buttonName) {
        basePage.clickButton(buttonName);
    }

    @And("{string} page is open")
    public void pageIsOpen(String expectedPageName) {
        String actualPageName = basePage.isPageOpen();
        Assert.assertTrue(actualPageName.contains(expectedPageName));
        log.info(expectedPageName + " page is open.");
    }
}
