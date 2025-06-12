package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.DriverSetUp;

public class Login extends DriverSetUp {
    @Test
    public void LoginPage() throws InterruptedException {
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        getDriver().manage().window().maximize();
        System.out.println("Page Title : " + getDriver().getTitle());

        // Username
        getDriver().findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(3000);
        //Password
        getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
      //Click Login Button
        getDriver().findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(3000);




    }
}
