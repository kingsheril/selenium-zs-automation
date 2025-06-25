package util;

public class Constants
{
    public static final String relativeXpathRegexForServiceInLeftPane = ".//nav[@aria-label='%s']";

    public enum SERVICES
    {
        CALENDAR("Calendar"),
        PROJECTS("Projects");

        // Attributes are service names in different places comes here.
        final String servicePanelName;

        SERVICES(String spn)
        {
            servicePanelName = spn;
        }

        public String getServicePanelName() {
            return servicePanelName;
        }
    }
}
