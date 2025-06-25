package search;

import base.SearchBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllAppsTestCase extends SearchBase
{

    @BeforeMethod
    public void clearSearchBox()
    {
        searchHome.clearSearchBox();
    }

    @Test
    public void listViewSearch()
    {
        pressEnter();
    }

    @Test
    public void querySearch()
    {
        searchHome.enterQueryInSearchBar("test");
        pressEnter();
    }
}
