package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetUp;

public class TestLoginPage extends DriverSetUp {

    LoginPage login_page = new LoginPage();
    DashboardPage dashboard_page = new DashboardPage();
        @Test
    public void TestPageTitle() {
        login_page.loadAPage(login_page.url);
        login_page.maximizeScreen();
        login_page.waitForElement(login_page.brandLogo);
        Assert.assertTrue(login_page.visibilityState(login_page.brandLogo));
    }
    @Test
    public void TestLoginPageWithValidCredentials() {
        login_page.loadAPage(login_page.url);
//      login_page.getElement(login_page.userInputField);
        login_page.maximizeScreen();
        login_page.waitForElement(login_page.userInputField);
        login_page.writeOnElement(login_page.userInputField,login_page.userName);
        login_page.writeOnElement(login_page.userPasswordField,login_page.userPassword);
        login_page.clickOnElement(login_page.loginBtn);
        dashboard_page.waitForElement(dashboard_page.dashboardHeaderText);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.dashboardHeaderText),dashboard_page.dashboardText);
        dashboard_page.backwardPage();
        login_page.loadAPage(login_page.url);

    }

    @Test(dataProvider = "invalidCredentials",dataProviderClass = DataSet.class)
    public void TestLoginPageWithInvalidCredentials(String userName, String pass, String errorText, String requiredText){
        login_page.loadAPage(login_page.url);
        login_page.maximizeScreen();
        login_page.waitForElement(login_page.userInputField);
        login_page.writeOnElement(login_page.userInputField,userName);
        login_page.writeOnElement(login_page.userPasswordField,pass);
        login_page.clickOnElement(login_page.loginBtn);
        if(userName.isEmpty() || pass.isEmpty()){
//            WebElement requiredElement = login_page.waitForElement(login_page.inputRequiredText);
//            Assert.assertEquals(requiredElement.getText(), requiredText);
            Assert.assertEquals(login_page.waitForElement(login_page.inputRequiredText).getText(),requiredText);
        }
        else{

//            WebElement errorElement = login_page.waitForElement(login_page.errorMsgField);
//            Assert.assertEquals(errorElement.getText(), errorText);
            Assert.assertEquals(login_page.waitForElement(login_page.errorMsgField).getText(),errorText);
        }
    }
//Manually test the Forgot password functionality

//    @Test
//    public void TestForgotPass(){
//        login_page.loadAPage(login_page.url);
//        login_page.maximizeScreen();
//        login_page.waitForElement(login_page.forgotPass);
//        login_page.clickOnElement(login_page.forgotPass);
//        login_page.waitForElement(login_page.resetPassHeader);
//        Assert.assertTrue(login_page.visibilityState(login_page.resetPassHeader),login_page.resetPassHeaderText);
//        login_page.writeOnElement(login_page.userInputField,login_page.userName);
//        Assert.assertTrue(login_page.visibilityState(login_page.resetPassBtn));
//        login_page.clickOnElement(login_page.resetPassBtn);
//        login_page.waitForElement(login_page.resetPassSendText);
//        Assert.assertEquals(login_page.getElementText(login_page.resetPassSendText),login_page.resetPassText);
//        login_page.loadAPage(login_page.url);
//
//    }
//    @Test
//    public void TestResetPassWithEmptyUserNameField()  {
//            login_page.loadAPage(login_page.url);
//            login_page.maximizeScreen();
//            login_page.waitForElement(login_page.forgotPass);
//            login_page.clickOnElement(login_page.forgotPass);
//            login_page.waitForElement(login_page.resetPassBtn);
//            login_page.clickOnElement(login_page.resetPassBtn);
//            Assert.assertEquals(login_page.getElementText(login_page.inputRequiredText),login_page.requiredText);
//    }
//    @Test
//    public void TestCancelResetPass(){
//        login_page.loadAPage(login_page.url);
//        login_page.maximizeScreen();
//        login_page.waitForElement(login_page.forgotPass);
//        login_page.clickOnElement(login_page.forgotPass);
//        login_page.waitForElement(login_page.userInputField);
//        login_page.writeOnElement(login_page.userInputField,login_page.userName);
//        Assert.assertTrue(login_page.visibilityState(login_page.cancelResetPassBtn));
//        login_page.clickOnElement(login_page.cancelResetPassBtn);
//
//    }

    //Test Forgot password functionality use Test-driven-data
    @Test(dataProvider = "ForgotPassAndResetPass", dataProviderClass = DataSet.class)
    public void TestForgotPass(String name, boolean isExpectedMsg, String expectedText){
        login_page.loadAPage(login_page.url);
        login_page.maximizeScreen();
        login_page.waitForElement(login_page.forgotPass);
        login_page.clickOnElement(login_page.forgotPass);
        login_page.waitForElement(login_page.resetPassHeader);
        Assert.assertTrue(login_page.visibilityState(login_page.resetPassHeader),login_page.resetPassHeaderText);
        login_page.writeOnElement(login_page.userInputField,name);
        Assert.assertTrue(login_page.visibilityState(login_page.resetPassBtn));
        login_page.clickOnElement(login_page.resetPassBtn);
        if(isExpectedMsg){
            login_page.waitForElement(login_page.resetPassSendText);
           Assert.assertEquals(login_page.getElementText(login_page.resetPassSendText),expectedText);
        }
        else{
            login_page.waitForElement(login_page.inputRequiredText);
            Assert.assertEquals(login_page.getElementText(login_page.inputRequiredText),expectedText);
        }

    }

    @Test(dataProvider = "cancelResetPass", dataProviderClass = DataSet.class)
    public void TestCancelResetPass( String userName){
        login_page.loadAPage(login_page.url);
        login_page.maximizeScreen();
        login_page.waitForElement(login_page.forgotPass);
        login_page.clickOnElement(login_page.forgotPass);
        login_page.waitForElement(login_page.userInputField);
        login_page.writeOnElement(login_page.userInputField,userName);
        Assert.assertTrue(login_page.visibilityState(login_page.cancelResetPassBtn));
        login_page.clickOnElement(login_page.cancelResetPassBtn);

    }
}
