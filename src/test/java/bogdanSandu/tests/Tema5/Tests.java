package bogdanSandu.tests.Tema5;

import bogdanSandu.driver.BrowserManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    public static void main(String[] args) {
        ChromeDriver driver = BrowserManager.createDriverAndGetPage();
        HerokuAppTests herokuApp = new HerokuAppTests("https://testpages.herokuapp.com/styled/index.html", driver);
        //HerokuApp
        herokuApp.getFirstLinkTitle();
        herokuApp.firstLinkOpen();
        herokuApp.getFirstLinkText();
        herokuApp.getFirstParagraph();
        herokuApp.returnPage();
        herokuApp.getSecondLinkTitle();
        herokuApp.secondLinkOpen();
        herokuApp.getSecondtLinkText();
        herokuApp.returnPage();
        herokuApp.getThirdLinkTitle();
        herokuApp.thirdLinkOpen();
        herokuApp.getLinksFromList();
        herokuApp.returnPage();
        herokuApp.getFourthLinkTitle();
        herokuApp.fourthLinkOpen();
        herokuApp.getInfoForTable();
//        BrowserManager.closeBrowser(driver);
        //DemoQa
        DemoQATests demoQa = new DemoQATests("https://demoqa.com/elements", driver);
        demoQa.selectTextBox();
        demoQa.updateTextField();
        demoQa.getInfo();
        demoQa.selectCheckBox();
        demoQa.celectRadioButton();
        demoQa.selectWebTables();
        demoQa.updateTextTables();
        BrowserManager.closeBrowser(driver);
    }
}
