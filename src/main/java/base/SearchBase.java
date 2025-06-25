package base;

import driver.DriverManager;
import org.testng.annotations.AfterClass;
import pageObjects.SearchTab;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class SearchBase extends BaseTest
{
    public SearchTab searchTab;

    @BeforeClass
    public void initPageObjects()
    {
        searchTab = new SearchTab(DriverManager.getDriver());
        launchBrowser();
        login();
    }

    @AfterClass
    public void closeBrowser() throws IOException {
        DriverManager.getDriver().close();
        DriverManager.getDriver().quit();
    }
}
