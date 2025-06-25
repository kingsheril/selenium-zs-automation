package search;

import base.SearchBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.Constants.SERVICES;

public class Calendar extends SearchBase
{

    @BeforeMethod
    public void clearSearchBox()
    {
        searchHome.clearSearchBox();
    }

    @BeforeClass()
    public void selectCalendarService()
    {
        searchTab.selectServiceInLeftPane(SERVICES.CALENDAR.getServicePanelName());
    }

    @Test
    public void searchTest()
    {
        searchHome.enterQueryInSearchBar("test");
        pressEnter();
    }
}
