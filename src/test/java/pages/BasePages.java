package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.DriverSetUp.getDriver;

public class BasePages {
    public void loadAPage(String url){
        getDriver().get(url);
    }
    public void maximizeScreen(){
        getDriver().manage().window().maximize();
    }
    public WebElement waitForElement(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }
    public void writeOnElement(By locator, String text ){
        getElement(locator).sendKeys(text);
    }
    public void clickOnElement(By locator){
        getElement(locator).click();
    }
    public String getElementText(By locator){
        return getElement(locator).getText();
    }
    public boolean visibilityState (By locator){
        return getElement(locator).isDisplayed();
    }
    public void backwardPage(){
        getDriver().navigate().back();
    }
    public boolean checkCurrentUrl(String url) {
        return getDriver().getCurrentUrl().equals(url);
    }
    public void scrollElement(By locator){
        WebElement element = getDriver().findElement(locator);
        Actions action = new Actions(getDriver());
        action.scrollToElement(element).build().perform();
    }
    public void markAll (By locator){
        WebElement element =getDriver().findElement(locator);
        element.click();
        Actions action = new Actions(getDriver());
        action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
    }
public void clearInput(By locator){
        getDriver().findElement(locator).clear();
}

}
