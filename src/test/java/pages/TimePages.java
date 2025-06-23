package pages;

import org.openqa.selenium.By;

public class TimePages extends BasePages {
    public String attendanceText = "Attendance";
    public By clickTime = By.xpath("//a[@class='oxd-main-menu-item active']//span[1]");
    public By timesheetsPath = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']");
    public By watchIcon = By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']");
//  public By watchIcon = By.xpath("//i[@class='oxd-icon bi-stopwatch']");
    public By attendancePath = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    public By attendanceDropdown = By.xpath("//span[contains(text(),'Attendance')]");
    public By selectMenu = By.xpath("//a[normalize-space()='Punch In/Out']");




    public void DoAuthenticationAndClickThePage(){
        maximizeScreen();
        waitForElement(watchIcon);
       clickOnElement(watchIcon);

    }

}
