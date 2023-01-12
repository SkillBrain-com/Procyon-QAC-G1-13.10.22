package sorinfoca.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sorinfoca.driver.DriverSetup;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MyTests extends TestConfig {

    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = DriverSetup.setupDriver();
    }

    @Test
    public void testValidLogin() {
        driver.get(getBaseUrl());
        driver.findElement(By.cssSelector("#menu-right > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.name("username")).sendKeys("valid_username");
        driver.findElement(By.name("password")).sendKeys("valid_password");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        assertTrue(driver.findElement(By.cssSelector("#menu-right > ul > li.dropdown.open > ul > li:nth-child(1) > a")).isDisplayed());
    }

    @Test
    public void testInvalidLogin() {
        driver.get(getBaseUrl());
        driver.findElement(By.cssSelector("#menu-right > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.name("username")).sendKeys("invalid_username");
        driver.findElement(By.name("password")).sendKeys("invalid_password");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger")).isDisplayed());
    }

    @Test
    public void testRedirectToLogin() {
        driver.get(getBaseUrl());
        driver.findElement(By.cssSelector("#menu-right > ul > li:nth-child(4) > a")).click();
        assertEquals(getBaseUrl() + "/auth/login", driver.getCurrentUrl());
    }

    @Test
    public void testPositiveBookingScenario() {
        driver.get(getBaseUrl());
        // login as valid user
        driver.findElement(By.cssSelector("#menu-right > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.name("username")).sendKeys("valid_username");
        driver.findElement(By.name("password")).sendKeys("valid_password");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        // navigate to appointment page
        driver.findElement(By.cssSelector("#menu-right > ul > li:nth-child(4) > a")).click();
        // fill out and submit appointment form
        driver.findElement(By.name("name")).sendKeys("John Smith");
        driver.findElement(By.name("email")).sendKeys("john.smith@example.com");
        driver.findElement(By.name("date")).sendKeys("2022-12-25");
        driver.findElement(By.name("symptoms")).sendKeys("Fever and cough");
        driver.findElement(By.xpath("//button[text()='Book Appointment']")).click();
        // verify successful booking message
        assertTrue(driver.findElement(By.cssSelector(".alert.alert-success")).isDisplayed());
    }

    @Test
    public void testNegativeBookingScenario() {
        driver.get(getBaseUrl());
        // navigate to appointment page
        driver.findElement(By.cssSelector("#menu-right > ul > li:nth-child(4) > a")).click();
        // fill out and submit appointment form with missing required fields
        driver.findElement(By.name("name")).sendKeys("John Smith");
        driver.findElement(By.name("email")).sendKeys("john.smith@example.com");
        driver.findElement(By.xpath("//button[text()='Book Appointment']")).click();
        // verify error message
        assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger")).isDisplayed());
    }

    @Test
    public void testHomeButton() {
        driver.get(getBaseUrl() + "/path/to/page");
        driver.findElement(By.cssSelector("#menu-right > ul > li:nth-child(1) > a")).click();
        assertEquals(getBaseUrl() + "/", driver.getCurrentUrl());
    }
}
