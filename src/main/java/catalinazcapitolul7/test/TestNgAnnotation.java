package catalinazcapitolul7.test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.annotations.Test.*;

public class TestNgAnnotation {
    public void afterSuite() {
        System.out.println("After suite");
    }

    @BeforeGroups
    @BeforeGroups(groups = "test2")
    public void beforeGroups() {
        System.out.println("Before groups");
    }

    @AfterGroups
    @AfterGroups(groups = "test2")
    public void afterGroups() {
        System.out.println("After groups");
    }
    @Test
     public void afterMethod() {
        public void test() {
            System.out.println("Test method");
        }

        @Test(groups = "test2")
        public void test2() {
            System.out.println("Test method 2");
        }
    }
}
