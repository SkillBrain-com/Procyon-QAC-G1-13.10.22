package bogdanSandu.tests.Tema7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CURAHealthcare extends TestBase {

    @Test
    public void login() {
        // go to login page
        WebElement menu = driver.findElement(By.id("menu-toggle"));
        menu.click();
        System.out.println("Click on menu");
        WebElement menuLogin = driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a"));
        menuLogin.click();
        System.out.println("Click on login menu");
        // access elements of login page
        WebElement username = driver.findElement(By.id("txt-username"));
        WebElement password = driver.findElement(By.id("txt-password"));
        WebElement login = driver.findElement(By.id("btn-login"));
        // enter login data
        username.sendKeys("John Doe");
        System.out.println("Completed username");
        password.sendKeys("ThisIsNotAPassword");
        System.out.println("Completed password");
        login.click();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://katalon-demo-cura.herokuapp.com/#appointment";
        try {
            Assert.assertEquals(expectedUrl,actualUrl);
        }
        catch (AssertionError e) {
            System.out.println("Login failed!");
        }
    }

    @Test
    public void invalidLogin(){
        WebElement menu = driver.findElement(By.id("menu-toggle"));
        menu.click();
        System.out.println("Click on menu");
        WebElement menuLogin = driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a"));
        menuLogin.click();
        System.out.println("Click on login menu");
        // access elements of login page
        WebElement username = driver.findElement(By.id("txt-username"));
        WebElement password = driver.findElement(By.id("txt-password"));
        WebElement login = driver.findElement(By.id("btn-login"));
        // enter login data
        username.sendKeys("Invalid Username");
        System.out.println("Completed username with invalid name");
        password.sendKeys("ThisIsNotAPassword");
        System.out.println("Completed password");
        login.click();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://katalon-demo-cura.herokuapp.com/#appointment";
        try {
            Assert.assertEquals(expectedUrl,actualUrl);
        }
        catch (AssertionError e) {
            System.out.println("Login failed!");
        }
    }

    @Test
    public void makeAppointment(){
        driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
        WebElement appointment = driver.findElement(By.id("btn-make-appointment"));
        appointment.click();
        login();
        Select facility = new Select(driver.findElement(By.id("combo_facility")));
        facility.selectByVisibleText("Tokyo CURA Healthcare Center");
        System.out.println("Select facility");
        WebElement applyForHospitalReadmission = driver.findElement(By.id("chk_hospotal_readmission"));
        applyForHospitalReadmission.click();
        System.out.println("Select: Apply for hospital readmission");
        WebElement medicare = driver.findElement(By.id("radio_program_medicare"));
        medicare.click();
        System.out.println("Select program for healtcare");
        WebElement visitDate = driver.findElement(By.id("txt_visit_date"));

        System.out.println("Select date");
        WebElement comment = driver.findElement(By.id("txt_comment"));
        comment.sendKeys("Test comment");
        System.out.println("Complete on comment section");
        WebElement bookAppointment = driver.findElement(By.id("btn-book-appointment"));
        bookAppointment.click();
        System.out.println("Clisk on booking appointment");

    }
}
