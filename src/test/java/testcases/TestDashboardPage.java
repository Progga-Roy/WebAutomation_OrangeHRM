package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetUp;

public class TestDashboardPage extends DriverSetUp {

    LoginPage login_page = new LoginPage();
    DashboardPage dashboard_page = new DashboardPage();
    @Test
    public void TestOpenTheDashboardWithLogin() throws InterruptedException {
    login_page.loadAPage(login_page.url);
    login_page.waitForElement(login_page.userInputField);
    login_page.writeOnElement(login_page.userInputField,login_page.userName);
    login_page.writeOnElement(login_page.userPasswordField, login_page.userPassword);
    login_page.clickOnElement(login_page.loginBtn);
    dashboard_page.waitForElement(dashboard_page.dashboardHeaderText);
    dashboard_page.maximizeScreen();
    Assert.assertEquals(dashboard_page.getElementText(dashboard_page.dashboardHeaderText),dashboard_page.dashboardText);

    }


    @Test
    public void LoadTheDashboardPage() {
        login_page.LoginThePage();
        dashboard_page.waitForElement(dashboard_page.dashboardHeaderText);
        dashboard_page.visibilityState(dashboard_page.dashboardHeaderText);
        Assert.assertTrue(dashboard_page.checkCurrentUrl(dashboard_page.url));
    }

    @Test(dataProvider = "WidgetTitle",dataProviderClass = DataSet.class)
    public void TestDashBoardWidgetHeading(String heading) throws InterruptedException {
        login_page.LoginThePage();

        dashboard_page.loadAPage(dashboard_page.url);
        Thread.sleep(3000);
        switch (heading){
            case dashboard_page.TimeAtWorkText:
                return dashboard_page.TimeAtWork;

        }

    }
}
