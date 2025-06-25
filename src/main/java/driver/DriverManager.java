package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager
{
    public static WebDriver getDriver()
    {
        return DriverThreadLocal.webDriver.get();
    }

    public static void createDriver()
    {
        DriverThreadLocal.webDriver.set(new ChromeDriver());
    }

    public static void createDriverWait()
    {
        DriverThreadLocal.wait.set(new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10)));
    }

    public static WebDriverWait getDriverWait()
    {
        return DriverThreadLocal.wait.get();
    }

}

class DriverThreadLocal
{
    public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    public static ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();

    public static void setDriver(WebDriver driver)
    {
        webDriver.set(driver);
    }

    public static WebDriver getDriver()
    {
        return webDriver.get();
    }

    public static void setDriverWait(WebDriverWait driverWait)
    {
        wait.set(driverWait);
    }

    public static WebDriverWait getDriverWait()
    {
        return wait.get();
    }
}