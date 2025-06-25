package base;

import driver.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import pageObjects.AccountsPage;
import pageObjects.SearchHome;

import java.io.IOException;

public class BaseTest extends CommonActions
{
    public AccountsPage accountsPage;
    public SearchHome searchHome;

    public void launchBrowser()
    {
        DriverManager.getDriver().get("https://search.localzoho.com");
        DriverManager.getDriver().manage().window().maximize();
    }

    public void login()
    {
        accountsPage.clickSignInButton();
        DriverManager.getDriverWait().until(ExpectedConditions.elementToBeClickable(accountsPage.userNameField));
        accountsPage.enterUserName("sheril.ss");
        pressEnter();
        DriverManager.getDriverWait().until(ExpectedConditions.elementToBeClickable(accountsPage.passwordField));
        accountsPage.enterPassword("I@mIronMan#13");
        pressEnter();
    }

    @BeforeClass
    public void setup()
    {
        try
        {
            setupDriverObj();
            accountsPage = new AccountsPage(DriverManager.getDriver());
            searchHome = new SearchHome(DriverManager.getDriver());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setupDriverObj() throws IOException
    {
        DriverManager.createDriver();
        DriverManager.createDriverWait();
//        System.out.println("Driver Created by thread - "+Thread.currentThread().getName());
    }
}
