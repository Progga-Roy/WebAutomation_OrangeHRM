package pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePages {
    public String url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
    public String  dashboardText = "Dashboard";
    public By dashboardHeaderText = By.xpath("//h6[normalize-space()='Dashboard']");
}
