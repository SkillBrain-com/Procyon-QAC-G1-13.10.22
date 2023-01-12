package teofilursan.teorie;

import org.testng.annotations.*;

public class TestNgAnnotations {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before groups");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("After groups");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @Test
    public void test() {
        System.out.println("Test method");
    }
}
