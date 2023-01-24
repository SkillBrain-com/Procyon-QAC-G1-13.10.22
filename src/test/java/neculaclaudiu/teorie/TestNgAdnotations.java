package neculaclaudiu.teorie;

import org.testng.annotations.*;

public class TestNgAdnotations {

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }
    @BeforeGroups(groups = "test2")
    public void beforeGroups(){
        System.out.println("Before group");
    }
    @AfterGroups(groups = "test2")
    public void afterGroups(){
        System.out.println("After group");
    }
    @Test
    public void test(){
        System.out.println("Test method");
    }
    @Test(groups = "test2")
    public void test2(){
        System.out.println("Test method 2");
    }
}
