package pageObjects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.Constants;

public class SearchTab
{
    @FindBy(xpath = "//div[@id='zgs20_gsServListHolder']")
    WebElement servicesPanel;

    public SearchTab(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void selectServiceInLeftPane(String service)
    {
        DriverManager.getDriverWait().until(ExpectedConditions.elementToBeClickable(servicesPanel));
        WebElement serviceElement = servicesPanel.findElement(By.xpath(String.format(Constants.relativeXpathRegexForServiceInLeftPane, service)));
        serviceElement.click();
    }
}
