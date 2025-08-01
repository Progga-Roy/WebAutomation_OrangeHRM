package pages;

import org.openqa.selenium.By;
import utilities.DriverSetUp;

public class LoginPage extends BasePages {

    public String  url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public String userName = "Admin";
    public String userPassword = "admin123";
    public String errorText = "Invalid credentials";
    public String requiredText = "Required";
    public String  resetPassHeaderText = "Reset Password";

    public String resetPassText = "Reset Password link sent successfully";
    public By brandLogo = By.xpath("//img[@alt='company-branding']");
    public By userInputField = By.xpath("//input[@placeholder='Username']");
    public By userPasswordField = By.xpath("//input[@placeholder='Password']");
    public By loginBtn = By.xpath("//button[normalize-space()='Login']");
    public By errorMsgField = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
    public By inputRequiredText = By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']");
//    public By inputRequiredText = By.xpath("//span[contains(text=(),'Required')]");
    public By resetPassHeader= By.xpath("//h6[normalize-space()='Reset Password']");
    public By forgotPass = By.xpath("//div[@class='orangehrm-login-forgot']");
    public By resetPassBtn = By.xpath("//button[normalize-space()='Reset Password']");
    public By cancelResetPassBtn = By.xpath("//button[normalize-space()='Reset Password']");
    public By  resetPassSendText= By.xpath("//h6[normalize-space()='Reset Password link sent successfully']");


//span[contains(text=(),'Required')

public void LoginThePage(){
    loadAPage(url);
    maximizeScreen();
    waitForElement(userInputField);
    writeOnElement(userInputField,userName);
    writeOnElement(userPasswordField,userPassword);
    clickOnElement(loginBtn);
}




}




