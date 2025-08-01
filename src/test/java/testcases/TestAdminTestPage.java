package testcases;

import org.testng.annotations.Test;
import pages.AdminPage;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DriverSetUp;

public class TestAdminTestPage extends DriverSetUp {
    LoginPage login_page = new LoginPage();
    AdminPage admin_page = new AdminPage();
    DashboardPage dashboard_page = new DashboardPage();

    @Test
    public void TestOpenTheAdminPageWithLogin()  {
        login_page.LoginThePage();
        admin_page.waitForElement(admin_page.adminPath);
        admin_page.scrollElement(admin_page.adminPath);
        admin_page.waitForElement(admin_page.adminPath);
        admin_page.clickOnElement(admin_page.adminPath);
    }


}
