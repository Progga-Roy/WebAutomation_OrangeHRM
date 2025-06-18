package pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePages {
    public String  dashboardText = "Dashboard";
    public By dashboardHeaderText = By.xpath("//h6[normalize-space()='Dashboard']");
}
