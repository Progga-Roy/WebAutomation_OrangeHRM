package pages;

import org.openqa.selenium.By;

public class TimePages extends BasePages {
    public String attendanceText = "Attendance";
    public String selectMonthText = "October";
    public String requiredText = "Required";

// public String buttonText = getElementText(punchInButton).trim();
    public By clickTime = By.xpath("//a[@class='oxd-main-menu-item active']//span[1]");
    public By timesheetsPath = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']");
    public By watchIcon = By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']");
//  public By watchIcon = By.xpath("//i[@class='oxd-icon bi-stopwatch']");
    public By attendancePath = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    public By attendanceDropdown = By.xpath("//span[contains(text(),'Attendance')]");
    public By selectMenu = By.xpath("//a[normalize-space()='Punch In/Out']");
    public By calender = By.xpath("//input[@placeholder='yyyy-dd-mm']");
    public By month = By.xpath("//div[@class ='oxd-calendar-selector-month-selected']");
    public By year = By.xpath("//div[@class ='oxd-calendar-selector-year-selected']");
    public By selectMonth = By.xpath("//li[contains(text(), 'October')]");
    public By selectDate = By.xpath("//div[contains(text(), '12')]");
    public By selectYear = By.xpath("//li[contains(text(), '2023')]");
    public By time = By.xpath("//input[@placeholder='hh:mm']");
    public By hour = By.xpath("//input[@class='oxd-input oxd-input--active oxd-time-hour-input-text']");
    public By minuteDownIcon = By.xpath("//i[@class='oxd-icon bi-chevron-down oxd-icon-button__icon oxd-time-minute-input-down']");
    public By minuteUpIcon = By.xpath("//i[@class='oxd-icon bi-chevron-up oxd-icon-button__icon oxd-time-minute-input-up']");
    public By hourDownIcon = By.xpath("//i[@class='oxd-icon bi-chevron-down oxd-icon-button__icon oxd-time-hour-input-down']");
    public By hourUpIcon = By.xpath("//i[@class='oxd-icon bi-chevron-up oxd-icon-button__icon oxd-time-hour-input-up']");
    public By pm = By.xpath("//input[@name='pm']");
    public By am = By.xpath("//input[@name='am']");

    public By textArea = By.xpath("//textarea[@placeholder='Type here']");
    public By punchInButton = By.xpath("//button[normalize-space()='In']");
//    public By required = By.xpath("//span[contains(text(),'Required')]");
    public By required = By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']");
//    public By punchOutButton = By.xpath("//button[normalize-space()='Out']");
//   public String buttonText = getPunchButtonText();



    public String getPunchButtonText() {
        return getElementText(punchInButton).trim();
    }
    public void EnterThePageAndClickTheIcon(){
        maximizeScreen();
        waitForElement(watchIcon);
        clickOnElement(watchIcon);


    }

}
