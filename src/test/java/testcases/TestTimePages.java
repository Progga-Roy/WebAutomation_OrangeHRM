package testcases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TimePages;
import utilities.DriverSetUp;

public class TestTimePages extends DriverSetUp {

    LoginPage login_page = new LoginPage();
 TimePages time_page = new TimePages();
 DashboardPage dashboard_page = new DashboardPage();

 @Test
 public void TestTimeElements() throws InterruptedException {
   login_page.LoginThePage();
   login_page.maximizeScreen();
   time_page.waitForElement(time_page.watchIcon);
   Thread.sleep(3000);
   time_page.clickOnElement(time_page.watchIcon);
   Thread.sleep(3000);
   time_page.waitForElement(time_page.attendancePath);
   Assert.assertEquals(time_page.getElementText(time_page.attendancePath),time_page.attendanceText);

    }

}
