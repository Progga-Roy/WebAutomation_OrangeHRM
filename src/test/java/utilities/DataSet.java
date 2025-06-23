package utilities;


import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataSet {
@DataProvider(name = "invalidCredentials")
     public static Object TryLoginWithInvalidCredentials(){
         Object [][] data = {
                 {"username","admin123","Invalid credentials","Required"},
                 {"admin","pass12","Invalid credentials","Required"},
                 {"username","pass","Invalid credentials","Required"},
                 {"","admin123","Invalid credentials","Required"},
                 {"admin","","Invalid credentials","Required"},
                 {"","","Invalid credentials","Required"},

         };
         return data;
     }

    @DataProvider(name ="ForgotPassAndResetPass")
    public static Object TestForgotPassword(){

        Object [][] data = {
                {"Admin",true,"Reset Password link sent successfully"},
                {"",false,"Required"},
                {"invalidName",true,"Reset Password link sent successfully"},
        };
        return data;
    }

    @DataProvider(name = "cancelResetPass")
    public static Object CancelResetButton(){
        Object [][] data = {
                {""},
                {"Admin"}

        };
        return data;
    }

//    @DataProvider(name ="WidgetTitle")
//    public static Object TestDashboardWidgetTitle(){
//        Object [][] data ={
//                {dashboard_page.TimeAtWork,dashboard_page.TimeAtWorkText,dashboard_page.attendanceIcon,dashboard_page.attendancePath,dashboard_page.AttendanceText},
////                {"My Actions"},
////                {"Quick Launch"},
////                {"Buzz Latest Posts"},
////                {"Employees on Leave Today"},
////                {"Employee Distribution by Sub Unit"},
////                {"Employee Distribution by Sub Location"}
//        };
//        return data;
//    }

}
