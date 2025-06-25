package pageObjects;

import driver.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage
{
    @FindBy(linkText = "SIGN IN")
    public WebElement signInButtonInLandingPage;

    @FindBy(xpath = "//input[@id='login_id']")
    public WebElement userNameField;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordField;
    @FindBy(xpath = "//div[@class='fielderror errorlabel']")
    public WebElement msg_error;

    public AccountsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSignInButton()
    {
        signInButtonInLandingPage.click();
    }

    public void enterUserName(String userName)
    {
        userNameField.clear();
        userNameField.sendKeys(userName);
    }

    public void enterPassword(String password)
    {
        passwordField.clear();
        passwordField.sendKeys(password);
    }
}
