package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPage;
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
    admin_page.clickOnElement(admin_page.employeeName);
    Thread.sleep(3000);
    admin_page.writeOnElement(admin_page.employeeName,"Ajay Sharma");
    admin_page.clickOnElement(admin_page.uniqueName);
    admin_page.writeOnElement(admin_page.uniqueName,"Progga");
        Thread.sleep(3000);
    admin_page.clickOnElement(admin_page.password);
    admin_page.writeOnElement(admin_page.password,"hd8932h$%");
    admin_page.clickOnElement(admin_page.confirmPassword);
    admin_page.writeOnElement(admin_page.confirmPassword,"94j89eoi334");
    admin_page.waitForElement(admin_page.saveBtn);
    admin_page.clickOnElement(admin_page.saveBtn);
        Thread.sleep(3000);

    }

}
