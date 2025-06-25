package util;

public class Constants
{
    public enum SERVICES
    {
        CALENDAR("Calendar"),
        PROJECTS("Projects");

        // Attributes are service names in different places comes here.
        String servicePanelName;

        SERVICES(String spn)
        {
            servicePanelName = spn;
        }

        public String getServicePanelName() {
            return servicePanelName;
        }
    }
}
