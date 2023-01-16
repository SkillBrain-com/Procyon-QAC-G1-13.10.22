package ancaMarian.teorie;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }

    @BeforeClass
    public void beforeClass() { //ex: setari pt URL-uri
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeSuite
    public void beforeSuite() { //deschiderea conexiunii cu o baza de date
        System.out.println("Before suite");
    }

    @AfterSuite
    public void afterSuite() { //inchiderea conexiunii cu o baza de date
        System.out.println("After suite");
    }

    @BeforeGroups(groups = "test2")
    public void beforeGroups() { //o sa ruleze doar cand vom avea grupuri definite
        System.out.println("Before groups");
    }

    @AfterGroups(groups = "test2")
    public void afterGroups() {
        System.out.println("After groups");
    }

    @BeforeMethod
    public void beforeMethod() { //ex: deschiderea browserului inainte de fiecare metoda (setup.prerequisites)
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod() { //ex: inchiderea browserului dupa fiecare metoda (cleanup)
        System.out.println("After method");
    }

    @Test
    public void test(){
        System.out.println("Test method");
    }

    @Test(groups = "test2")
    public void test2() {
        System.out.println("Test method 2");
    }
}
