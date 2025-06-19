package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp {
    private static final String browser_name = System.getProperty("browser","Chrome");
    private static final ThreadLocal<WebDriver>DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    public static void setDriver(WebDriver driver){
        DriverSetUp.DRIVER_THREAD_LOCAL.set(driver);
    }

    public static WebDriver getDriver() {
        return DRIVER_THREAD_LOCAL.get();
    }

    @BeforeMethod
    public void startBrowser(){
       WebDriver driver = getBrowser(browser_name);
       setDriver(driver);
    }
    @AfterMethod
    public void closeBrowser(){
        getDriver().quit();
    }

    public WebDriver getBrowser(String name){
        if (name.equalsIgnoreCase("Chrome")){
            return new ChromeDriver();
        }else if (name.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }else if (name.equalsIgnoreCase("Edge")){
            return new EdgeDriver();
        }
        else{
            throw new RuntimeException("Browser is not available at this :" + name);
        }
    }
}
