package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetUp;

import java.util.List;

public class TestDashboardPage extends DriverSetUp {

    private static final Logger log = LoggerFactory.getLogger(TestDashboardPage.class);
    LoginPage login_page = new LoginPage();
    DashboardPage dashboard_page = new DashboardPage();

    @Test
    public void TestOpenTheDashboardWithLogin() throws InterruptedException {
        login_page.loadAPage(login_page.url);
        login_page.waitForElement(login_page.userInputField);
        login_page.writeOnElement(login_page.userInputField, login_page.userName);
        login_page.writeOnElement(login_page.userPasswordField, login_page.userPassword);
        login_page.clickOnElement(login_page.loginBtn);
        dashboard_page.waitForElement(dashboard_page.dashboardHeaderText);
        dashboard_page.maximizeScreen();
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.dashboardHeaderText), dashboard_page.dashboardText);
    }


    @Test
    public void LoadTheDashboardPage() {
        login_page.LoginThePage();
        dashboard_page.waitForElement(dashboard_page.dashboardHeaderText);
        dashboard_page.visibilityState(dashboard_page.dashboardHeaderText);
        Assert.assertTrue(dashboard_page.checkCurrentUrl(dashboard_page.url));
    }

    @Test
    public void TestDashBoardWidgetHeadingAndClickability() throws InterruptedException {

        login_page.LoginThePage();
        login_page.maximizeScreen();
        dashboard_page.maximizeScreen();
        dashboard_page.waitForElement(dashboard_page.HeadingTimeAtWork);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.HeadingTimeAtWork), dashboard_page.TimeAtWorkText);
        dashboard_page.waitForElement(dashboard_page.attendanceIcon);
        Assert.assertTrue(dashboard_page.visibilityState(dashboard_page.attendanceIcon));
        dashboard_page.clickOnElement(dashboard_page.attendanceIcon);
        dashboard_page.waitForElement(dashboard_page.attendancePath);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.attendancePath), dashboard_page.AttendanceText);
        dashboard_page.backwardPage();
        // My Actions Widget

        //Candidate To Interview
        dashboard_page.waitForElement(dashboard_page.HeadingMyActions);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.HeadingMyActions), dashboard_page.MyActionsText);
        dashboard_page.waitForElement(dashboard_page.candidateToInterviewPath);
        Assert.assertTrue(dashboard_page.visibilityState(dashboard_page.candidateToInterviewPath));
        dashboard_page.clickOnElement(dashboard_page.candidateToInterviewPath);
        dashboard_page.waitForElement(dashboard_page.recruitmentPath);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.recruitmentPath), dashboard_page.RecruitmentText);
        dashboard_page.backwardPage();
        //Leave Request To Approve
//        dashboard_page.waitForElement(dashboard_page.ClickSelfReview);
        Assert.assertTrue(dashboard_page.visibilityState(dashboard_page.ClickSelfReview));
        dashboard_page.clickOnElement(dashboard_page.ClickSelfReview);
        dashboard_page.waitForElement(dashboard_page.Performance);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.Performance), dashboard_page.PerformanceText);
        dashboard_page.backwardPage();
//Quick Launch
        //Time Sheets
//        dashboard_page.waitForElement(dashboard_page.HeadingQuickLaunch);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.HeadingQuickLaunch), dashboard_page.QuickLaunchText);
        dashboard_page.waitForElement(dashboard_page.ClickTimesheet);
        Assert.assertTrue(dashboard_page.visibilityState(dashboard_page.ClickTimesheet));
        dashboard_page.clickOnElement(dashboard_page.ClickTimesheet);
        dashboard_page.waitForElement(dashboard_page.Time);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.Time), dashboard_page.TimeText);
        dashboard_page.backwardPage();

        dashboard_page.waitForElement(dashboard_page.HeadingBuzzLatestPosts);
        Thread.sleep(3000);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.HeadingBuzzLatestPosts), dashboard_page.BuzzHeadingText);
        dashboard_page.waitForElement(dashboard_page.HeadingQuickLaunch);
        Assert.assertTrue(dashboard_page.visibilityState(dashboard_page.HeadingBuzzLatestPosts));
        dashboard_page.scrollElement(dashboard_page.ClickPost);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.ClickPost), dashboard_page.AuthorText);
        dashboard_page.clickOnElement(dashboard_page.ClickPost);
        dashboard_page.waitForElement(dashboard_page.Buzz);
        Assert.assertEquals(dashboard_page.getElementText(dashboard_page.Buzz), dashboard_page.BuzzText);
        dashboard_page.backwardPage();



    }
}