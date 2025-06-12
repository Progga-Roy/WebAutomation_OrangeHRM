package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetUp {
    private static final String browser_name = System.getProperty("browser","Chrome");
    private static final ThreadLocal<WebDriver>DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    public void setDriver(WebDriver driver){
        DriverSetUp.DRIVER_THREAD_LOCAL.set(driver);
    }
    public WebDriver getDriver(){
        return DRIVER_THREAD_LOCAL.get();

    }

   @BeforeSuite
    public void startBrowser(){
      WebDriver driver = getBrowser(browser_name);
      setDriver(driver);
    }
    @AfterSuite
    public void closeBrowser(){
        getDriver().quit();
    }
    public WebDriver getBrowser(String name){
        if(name.equalsIgnoreCase("Chrome")){
            return new ChromeDriver();
        } else if(name.equalsIgnoreCase("edge")){
            return new EdgeDriver();
        } if(name.equalsIgnoreCase("Firefox")){
            return new FirefoxDriver();
        }
        else{
            throw new RuntimeException("Browser not available in this name : " + name);
        }
    }
}
