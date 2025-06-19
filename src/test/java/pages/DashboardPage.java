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
    public By dashboardHeaderText = By.xpath("//h6[normalize-space()='Dashboard']");
    public By TimeAtWork = By.xpath("//p[normalize-space()='Time at Work']");
    public By MyActions = By.xpath("//p[normalize-space()='My Actions']");
    public By QuickLaunch = By.xpath("//p[normalize-space()='Quick Launch']");
    public By BuzzLatestPosts= By.xpath("//p[normalize-space()='Buzz Latest Posts']");
    public By EmployeesLeave = By.xpath("//p[normalize-space()='Employees on Leave Today']");
    public By EmployeeUnit = By.xpath("//p[normalize-space()='Employee Distribution by Sub Unit']");
    public By EmployeeLocation = By.xpath("//p[normalize-space()='Employee Distribution by Location']");

    public By jhssiue(String heading){
        switch (heading){
            case TimeAtWorkText:
                return TimeAtWork;

        }

    }


}
