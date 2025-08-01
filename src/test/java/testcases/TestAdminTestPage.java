package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.AdminPage;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DriverSetUp;

public class TestAdminTestPage extends DriverSetUp {
    LoginPage login_page = new LoginPage();
    AdminPage admin_page = new AdminPage();


    @Test
    public void TestOpenTheAdminPageWithLogin(){
        login_page.LoginThePage();
        admin_page.waitForElement(admin_page.adminPath);
        admin_page.scrollElement(admin_page.adminPath);
        admin_page.waitForElement(admin_page.adminPath);
        admin_page.clickOnElement(admin_page.adminPath);
        admin_page.waitForElement(admin_page.adminTitle);
        Assert.assertEquals(admin_page.getElementText(admin_page.adminTitle),admin_page.adminTitleText);

    }

    @Test
    public void TestAddUser() throws InterruptedException {
    login_page.LoginThePage();
    admin_page.loadAPage(admin_page.url);
    admin_page.waitForElement(admin_page.addBtn);
    admin_page.clickOnElement(admin_page.addBtn);
    admin_page.waitForElement(admin_page.selectRole);
    admin_page.clickOnElement(admin_page.selectRole);
    admin_page.waitForElement(admin_page.selectAdmin);
    admin_page.clickOnElement(admin_page.selectAdmin);
    admin_page.waitForElement(admin_page.selectStatus);
    admin_page.clickOnElement(admin_page.selectStatus);
    admin_page.waitForElement(admin_page.selectEnable);
    admin_page.clickOnElement(admin_page.selectEnable);


    }

}
