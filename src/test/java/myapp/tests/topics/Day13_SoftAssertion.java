package myapp.tests.topics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day13_SoftAssertion {

    @Test
    public void hardAssert(){
        /*
        TestNG
        Hard Assertion : if an assertion fails, then test case STOPS executing
        Assert class is used for hard assertion in TestNG
        Hard assertion is more common than soft assert
         */
        System.out.println("line 14");//prints
        Assert.assertTrue(true);//PASS so continue
        System.out.println("line 17");//prints
        Assert.assertTrue(false);//FAILS so do not run rest of the test case
        System.out.println("line 19");// doesn't print
    }
    @Test
    public void javaAssert(){
        /*
        Java
        this is also hard assertion but this comes from java
        if this assertion fails, then test case STOPS executing
        Note: We prefer testNG assertion instead of java assertion
        if assert fails, then throw java.lang.AssertionError
         */
        System.out.println("line 30");//prints
        assert 3<5;//PASS
        System.out.println("line 32");//prints
        assert "apple"=="apple";//PASS
        System.out.println("line 34");//prints
        assert "Apple".toLowerCase().contains("a");//PASS
        System.out.println("line 36");//prints
        assert "java".equals("selenium");//FAILS so do not run rest of the test case.
        //if("java".equals("selenium")){PASS}else{throw java.lang.AssertionError}
        System.out.println("line 38");// doesn't print
    }

    @Test
    public void softAssertion(){
        /*
        Soft Assertion : if a soft assertion fails, test case CONTINUE to execute.
        STEPS:
        1. create soft assert object.
        2. use the soft assert for assertions.
        3. use assertAll() to get the result
         */
        System.out.println("line 52");//prints
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(5,5);//PASS so continue
        System.out.println("line 56");//prints
        softAssert.assertTrue(false);//FAILS but still CONTINUE
        System.out.println("line 58");
        softAssert.assertEquals("apple","orange");//FAILS but still CONTINUE
        System.out.println("line 60");
        softAssert.assertAll("Test Case Completed...");
    }
}