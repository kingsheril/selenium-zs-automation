package base;

import driver.DriverManager;
import org.testng.annotations.AfterClass;
import pageObjects.SearchResultsPage;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class SearchBase extends ZiaSearchBase
{
    SearchResultsPage searchPage;

    @BeforeClass
    public void initPageObjects()
    {
        setup();
        super.initPageObjects();
        searchPage = new SearchResultsPage(DriverManager.getDriver());
    }

    @AfterClass
    public void closeBrowser() throws IOException {
        DriverManager.getDriver().close();
        DriverManager.getDriver().quit();
    }
}
