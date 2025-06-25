package search;

import base.SearchBase;
import org.testng.annotations.Test;

public class AllAppsTestCases extends SearchBase
{

    @Test
    public void listViewSearch()
    {
        searchHome.
        searchHome.enterQuery("test");
        pressEnter();
    }

    @Test
    public void querySearch()
    {
        searchHome.enterQuery("test");
        pressEnter();
    }
}
