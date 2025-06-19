package utilities;


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
//                 {"12234","admin123","Invalid credentials","Required"},
//                 {"admin","12234","Invalid credentials","Required"}

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

}
