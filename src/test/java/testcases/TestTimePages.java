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

    private static final Logger log = LoggerFactory.getLogger(TestTimePages.class);
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

    @Test
    public void TestPunchInAndOut() throws InterruptedException {
//Login the page and click the icon
        login_page.LoginThePage();
        time_page.EnterThePageAndClickTheIcon();
//        String buttonText = time_page.getPunchButtonText();
        time_page.waitForElement(time_page.attendanceDropdown);
        time_page.clickOnElement(time_page.attendanceDropdown);
        time_page.waitForElement(time_page.selectMenu);
        time_page.clickOnElement(time_page.selectMenu);

//Select month from the calendar
      Thread.sleep(3000);
        time_page.clickOnElement(time_page.calender);
        time_page.markAll(time_page.calender);
        time_page.clearInput(time_page.calender);
        time_page.clickOnElement(time_page.calender);
        time_page.clickOnElement(time_page.month);
        time_page.waitForElement(time_page.selectMonth);
        time_page.scrollElement(time_page.selectMonth);
        Assert.assertEquals(time_page.getElementText(time_page.selectMonth),time_page.selectMonthText);
        time_page.clickOnElement(time_page.selectMonth);
//Select date from the calendar
        time_page.waitForElement(time_page.selectDate);
        time_page.clickOnElement(time_page.selectDate);
//Select year from the calendar
        time_page.clickOnElement(time_page.calender);
        time_page.clickOnElement(time_page.year);
        time_page.waitForElement(time_page.selectYear);
        time_page.scrollElement(time_page.selectYear);
        time_page.clickOnElement(time_page.selectYear);
//Select Time
        time_page.clickOnElement(time_page.time);
        time_page.waitForElement(time_page.hour);
        time_page.clickOnElement(time_page.hour);
//        Thread.sleep(3000);
//        time_page.markAll(time_page.time);
//        Thread.sleep(3000);
//        time_page.clearInput(time_page.time);
//       Thread.sleep(3000);
//        time_page.writeOnElement(time_page.time,"03");
        time_page.clickOnElement(time_page.hourDownIcon);
        time_page.clickOnElement(time_page.hourDownIcon);
        time_page.waitForElement(time_page.hourUpIcon);
        time_page.clickOnElement(time_page.hourUpIcon);
//        time_page.waitForElement(time_page.minuteDownIcon);
        time_page.clickOnElement(time_page.minuteUpIcon);
        time_page.clickOnElement(time_page.minuteUpIcon);
        time_page.clickOnElement(time_page.minuteUpIcon);
        time_page.clickOnElement(time_page.minuteUpIcon);
        time_page.clickOnElement(time_page.minuteDownIcon);
        time_page.clickOnElement(time_page.minuteDownIcon);

        time_page.clickOnElement(time_page.pm);
        time_page.clickOnElement(time_page.am);
        time_page.clickOnElement(time_page.pm);


//Write on textarea and click the button
        time_page.clickOnElement(time_page.textArea);
        time_page.waitForElement(time_page.textArea);
        time_page.writeOnElement(time_page.textArea,"I punched in on time");
        Assert.assertTrue(time_page.visibilityState(time_page.punchInButton),"In");
        time_page.clickOnElement(time_page.punchInButton);

//        if((buttonText).equalsIgnoreCase("In")){
//            time_page.clickOnElement(time_page.textArea);
//            time_page.writeOnElement(time_page.textArea,"I punched in on time");
//            Assert.assertTrue(time_page.visibilityState(time_page.punchInButton),"In");
//            Assert.assertTrue(time_page.visibilityState(time_page.punchOutButton),"Out");
//        }
//        else if((buttonText).equalsIgnoreCase("Out")){
//            time_page.clickOnElement(time_page.textArea);
//            time_page.writeOnElement(time_page.textArea,"I punched out on the day");
//            Assert.assertTrue(time_page.visibilityState(time_page.punchInButton),"Out");
//            Assert.assertTrue(time_page.visibilityState(time_page.punchOutButton),"Out");
//        }
//        else{
//            System.out.println();
//        }
//        time_page.clickOnElement(time_page.punchInButton);
//        Thread.sleep(3000);

    }

}
