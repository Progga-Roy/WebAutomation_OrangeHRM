package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DashboardPage extends BasePages {
    public String url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
    public String dashboardText = "Dashboard";
    public String TimeAtWorkText = "Time at Work";
    public String MyActionsText = "My Actions";
    public String QuickLaunchText = "Quick Launch";
    public String BuzzLatestPostsText = "Buzz Latest Posts";
    public String EmployeesLeaveText = "Employees on Leave Today";
    public String EmployeeUnitText = "Employee Distribution by Sub Unit";
    public String EmployeeLocationText = "Employee Distribution by Location";
    public String AttendanceText = "Attendance";
    public String RecruitmentText = "Recruitment";
    public String LeaveText = "Leave";
    public String PerformanceText = "Performance";
    public String TimeText = "Time";
    public String BuzzHeadingText = "Buzz Latest Posts";
    public String BuzzText = "Buzz";
    public String AuthorText = "Sania Shaheen";



    public By dashboardHeaderText = By.xpath("//h6[normalize-space()='Dashboard']");
    public By HeadingTimeAtWork = By.xpath("//p[normalize-space()='Time at Work']");
    public By HeadingMyActions = By.xpath("//p[normalize-space()='My Actions']");
    public By HeadingQuickLaunch = By.xpath("//p[normalize-space()='Quick Launch']");
    public By HeadingBuzzLatestPosts= By.xpath("//p[normalize-space()='Buzz Latest Posts']");
    public By HeadingEmployeesLeave = By.xpath("//p[normalize-space()='Employees on Leave Today']");
    public By HeadingEmployeeUnit = By.xpath("//p[normalize-space()='Employee Distribution by Sub Unit']");
    public By HeadingEmployeeLocation = By.xpath("//p[normalize-space()='Employee Distribution by Location']");
    public By attendancePath = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    public By recruitmentPath = By.xpath("//h6[normalize-space()='Recruitment']");
    public By ClickLeaveRequestToApprove= By.xpath("//p[normalize-space()='(1) Leave Request to Approve']");
    public By leave = By.xpath("//h6[normalize-space()='Leave']");
    public By ClickSelfReview = By.xpath("//p[normalize-space()='(1) Pending Self Review']");
    public By Performance = By.xpath("//h6[normalize-space()='Performance']");
    public By candidateToInterviewPath = By.xpath("//p[normalize-space()='(1) Candidate to Interview']");
    public By ClickPost = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']//div[3]//div[1]//div[2]//p[1]");
    public By ClickTimesheet = By.xpath("//button[@title='My Timesheet']//*[name()='svg']");
    public By Buzz = By.xpath("//h6[normalize-space()='Buzz']");
    public By Time = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    public By attendanceIcon = By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']");




}
