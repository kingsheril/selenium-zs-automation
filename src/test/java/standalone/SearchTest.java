package standalone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchTest
{
    public static void main(String[] args)
    {
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://search.zoho.com/");
//        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
//        WebElement signInLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("SIGN IN")));
//        signInLink.click();
        chromeDriver.findElement(By.linkText("SIGN IN")).click();


    }

}
