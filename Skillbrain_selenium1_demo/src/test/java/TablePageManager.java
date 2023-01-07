import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class TablePageManager {
    private static String url; // pagina pe care lucram
    private static ChromeDriver driver = null; // salvam instanta de chrome pe care o vom folosi in tate emtodele din clasa

    private static String idTabelInitial;


    TablePageManager(String url,ChromeDriver driver) // constructor
    {
        this.url = url;
        this.driver = driver;
        driver.get(url);
        this.idTabelInitial = "dynamictable";
    }

    public static String checkPage (){
        WebElement pageParagraph = driver.findElement(By.className("explanation"));
        return pageParagraph.getText();

    }

    public static String getTableTitle(){
        WebElement tableTitle = driver.findElement(By.cssSelector("#"+getIdTabelInitial()+" caption"));

        return tableTitle.getText();
    }

    public static List<String> getTableData(){
        List<WebElement> tableRows = driver.findElements(By.cssSelector("#"+getIdTabelInitial()+" tr"));
        List<String> tableData = new ArrayList<>();
        for(WebElement elem:tableRows){
            tableData.add(elem.getText());
        }
        return tableData;
    }

    public static void clickTableData(){
        WebElement tableDataButton = driver.findElement(By.tagName("details"));
        tableDataButton.click();
        if (checkRefreshButtonAppears() == true)
            System.out.println("Table Data Button was clicked");
        else System.out.println("Table Data Button was not clicked");
    }

    private static boolean checkRefreshButtonAppears(){
        WebElement refreshTable = driver.findElement(By.id("refreshtable"));
        if (refreshTable.getText().equals("Refresh Table"))
        return true;
        else return false;
    }

    public static boolean changeTableTitle(String newTableTitle){
        WebElement captionInput = driver.findElement(By.id("caption"));
        captionInput.click();
        captionInput.clear();
        captionInput.sendKeys(newTableTitle);
        clickRefreshButton();
        if (getTableTitle().equals(newTableTitle))
            return true;
        else return false;
    }

    private static void clickRefreshButton()
    {
        WebElement refreshTable = driver.findElement(By.id("refreshtable"));
        refreshTable.click();
    }

    public static void changeTableId(String newTableId)
    {
        WebElement tableIdInput = driver.findElement(By.id("tableid"));
        tableIdInput.click();
        tableIdInput.clear();
        tableIdInput.sendKeys(newTableId);
        clickRefreshButton();
        setIdTabelInitial(newTableId);
        WebElement newIdCheck = driver.findElement(By.id(newTableId));
        System.out.println(newIdCheck.getText());
    }

    public static void changeTableData(String newData)
    {
        WebElement changeTableDataInput = driver.findElement(By.id("jsondata"));
        changeTableDataInput.click();
        changeTableDataInput.clear();
        changeTableDataInput.sendKeys(newData);
        clickRefreshButton();
        System.out.println(getTableData());

    }

    public static String createJson(List<String> name,List<Integer> age){
        String finalString = "[";
        for(int i = 0;i < name.size();i++)
        {
            finalString = finalString + "{\"name\" : \"%s\",\"age\" : %d },".formatted(name.get(i),age.get(i));
        }
        finalString = finalString.substring(0,finalString.length()-1);
        finalString = finalString + "]";
        return finalString;
    }

    public static String getIdTabelInitial() {
        return idTabelInitial;
    }

    public static void setIdTabelInitial(String idTabelInitial) {
        TablePageManager.idTabelInitial = idTabelInitial;
    }
}
