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
        System.out.println("\n\nCalendar before method");
        searchHome.clearSearchBox();
    }

    @BeforeClass()
    public void selectCalendarService()
    {
        System.out.println("\n\nBefore class in Calendar");
        searchTab.selectServiceInLeftPane(SERVICES.CALENDAR.getServicePanelName());
    }

    @Test
    public void searchTest()
    {
        searchHome.enterQuery("test");
        pressEnter();
    }
}
