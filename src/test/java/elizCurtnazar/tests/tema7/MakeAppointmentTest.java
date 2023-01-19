package elizCurtnazar.tests.tema7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MakeAppointmentTest extends BaseTest{

    @Test
    public void clickMakeAppointmentButton() {
        driver.get("https://katalon-demo-cura.herokuapp.com");
        WebElement makeAppointmentButton = driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentButton.click();
        assertEquals(driver,)

        }
//        makeAppointmentButton.click();
//        System.out.println("Am dat click pe Make Appointment button si am intrat pe oagine de login!");

    }
}
