package pageObjects;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchHome
{
    @FindBy(xpath = "//a[@title='Zia Search']")
    WebElement homeButton;

    @FindBy(xpath = "//input[@id='zgs20_gsQueryBox']")
    WebElement searchBar;

    @FindBy(xpath = "//span[@id='zgs20_gsSearchBtnIcon']")
    WebElement searchButton;
    public SearchHome(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void enterQuery(String query)
    {
        searchBar.sendKeys(query);
    }

    public void clickSearchButton()
    {
        searchButton.click();
    }

    public void clearSearchBox()
    {
        DriverManager.getDriverWait().until(ExpectedConditions.elementToBeClickable(searchBar));
        searchBar.clear();
    }

}
