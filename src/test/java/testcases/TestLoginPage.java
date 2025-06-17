package testcases;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetUp;

public class TestLoginPage extends DriverSetUp {
    LoginPage login_page = new LoginPage();
    //    @Test
//    public void pageTitle(){
//        login_page.loadAPage(login_page.url);
//        login_page.maximizeScreen();
//        Assert.assertTrue(login_page.getElement(login_page.brandLogo).isDisplayed(),"logo is not displayed");
//    }
    @Test
    public void TestLoginPageWithValidCredentials(){
        login_page.loadAPage(login_page.url);
//      login_page.getElement(login_page.userInputField);
        login_page.maximizeScreen();
        login_page.waitForElement(login_page.userInputField);
        login_page.writeOnElement(login_page.userInputField,login_page.userName);
        login_page.writeOnElement(login_page.userPasswordField,login_page.userPassword);
        login_page.clickOnElement(login_page.loginBtn);
    }

    @Test(dataProvider = "invalidCredentials",dataProviderClass = DataSet.class)
    public void TestLoginPageWithEmptyUserName(String userName, String pass, String errorText, String requiredText) throws InterruptedException {
        login_page.loadAPage(login_page.url);
        login_page.maximizeScreen();
        login_page.waitForElement(login_page.userInputField);
        login_page.writeOnElement(login_page.userInputField,userName);
        login_page.writeOnElement(login_page.userPasswordField,pass);
        login_page.clickOnElement(login_page.loginBtn);
//       login_page.waitForElement(login_page.inputRequiredText);
        if(userName.isEmpty() || pass.isEmpty()){
//            Assert.assertEquals(login_page.getElementText(login_page.inputRequiredText),requiredText);
//            WebElement requiredElement = login_page.waitForElement(login_page.inputRequiredText);
//            Assert.assertEquals(requiredElement.getText(), requiredText);
            Assert.assertEquals(login_page.waitForElement(login_page.inputRequiredText).getText(),requiredText);
        }
        else{

//            Assert.assertEquals(login_page.getElementText(login_page.errorMsgField),errorText);
//            WebElement errorElement = login_page.waitForElement(login_page.errorMsgField);
//            Assert.assertEquals(errorElement.getText(), errorText);
            Assert.assertEquals(login_page.waitForElement(login_page.errorMsgField).getText(),errorText);
        }
    }
}
