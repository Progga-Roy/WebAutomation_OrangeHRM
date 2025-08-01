package pages;

import org.openqa.selenium.By;

public class AdminPage extends BasePages{
    public String url = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
    public String adminTitleText = "Admin";
    public By adminPath = By.xpath("//span[normalize-space()='Admin']");
    public By adminTitle = By.xpath("//span[normalize-space()='Admin']");
    public By addBtn = By.xpath("//button[normalize-space()='Add']");
    public By selectRole = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    public By selectAdmin = By.xpath("//div[@role='option']//span[normalize-space()='Admin']");
    public By selectStatus = By.xpath("(//div[@class='oxd-select-text--after'])[2]");
    public By selectEnable = By.xpath("//div[@role='option']//span[normalize-space()='Enabled']");




}
