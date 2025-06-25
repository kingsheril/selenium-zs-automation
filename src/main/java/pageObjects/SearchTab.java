package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchPage
{
    WebElement servicesPanel;

    public SearchPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
