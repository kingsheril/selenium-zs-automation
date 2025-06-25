package base;

import driver.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class CommonActions
{
    public void pressEnter()
    {
        new Actions(DriverManager.getDriver()).sendKeys(Keys.RETURN).perform();
    }


}
