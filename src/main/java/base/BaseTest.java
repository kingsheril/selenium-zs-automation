package base;

import driver.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AccountsPage;
import pageObjects.SearchHome;

import java.io.IOException;
import java.time.Duration;

public abstract class ZiaSearchBase extends CommonActions
{
    public AccountsPage accountsPage;
    public SearchHome searchHome;

    public void initPageObjects()
    {
        setup();
        accountsPage = new AccountsPage(DriverManager.getDriver());
        searchHome = new SearchHome(DriverManager.getDriver());
    }

    public void launchBrowser()
    {
        DriverManager.getDriver().get("https://search.localzoho.com");
        DriverManager.getDriver().manage().window().maximize();
    }

    public void login()
    {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));

        accountsPage.clickSignInButton();
        wait.until(ExpectedConditions.elementToBeClickable(accountsPage.userNameField));
        accountsPage.enterUserName("sheril.ss");
        pressEnter();
        accountsPage.enterPassword("I@mIronMan#13");
        pressEnter();
    }

    public void setup()
    {
        try
        {
            setupDriverObj();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setupDriverObj() throws IOException
    {
        DriverManager.createDriver();
    }
}
