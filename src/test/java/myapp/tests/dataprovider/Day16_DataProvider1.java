package myapp.tests.dataprovider;
import myapp.utilities.DataProviderUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Day16_DataProvider1 {
    //    DATA PROVIDER METHOD
    @DataProvider
    public Object[][] productListProvider(){
        Object productList[][] = {
                {"tesla"},
                {"toyota"},
                {"honda"},
                {"bmw"},
                {"volvo"}
        };
        return productList;
    }
    //    TEST METHOD IS CONNECTED TO THE DATA PROVIDER METHOD USING THE METHOD NAME
    @Test(dataProvider = "productListProvider")
    public void test1(String eachProduct){
        System.out.println(eachProduct);
    }
    //    DATA PROVIDER METHOD 2
    @DataProvider(name = "management_credentials")//giving a custom name using name annotation
    public Object[][] credentialsProvider(){
        Object credentials [][] = {
                {"admin1","pass1","CEO","60"},
                {"admin2","pass2","COO","56"},
                {"admin3","pass3","CFO","65"}
        };
        return credentials;
    }
    //    TEST METHOD 2
    @Test(dataProvider = "management_credentials",groups = "minor_regression_group")//calling the data provider methods with custom name
    public void test2(String userName,String password,String title, String age){
        System.out.println("Username "+ userName+" | Password "+password+" | Title "+title+" | Age "+age);
    }
    //    NOTE: the data providers methods can be stored in a UTIL CLASS
//    Create a DataProviderUtils class and call the data from that class!!!
//    If the data is coming from a different class, then we must use dataProviderClass = Class Name
//    TEST METHOD 3
    @Test(dataProvider = "employeeCredentialsProvider",dataProviderClass = DataProviderUtils.class)
    public void employeeCredentialsTest(String email,String pass){
        System.out.println("Email : "+email+" | Pass : "+pass);
    }
    //    Get the data from excel data provider that is in the DataProviderUtils
//    DATA TRANSFER FLOW --->>> excel > data provider method > test method
//    TEST  METHOD 3
    @Test(dataProvider = "excelEmployeeData",dataProviderClass = DataProviderUtils.class)
    public void excelEmployeeDataTest(String email, String pass){
        System.out.println("Email : "+email+" | Pass : "+pass);
    }
}