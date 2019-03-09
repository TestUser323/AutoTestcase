package CMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cms {
    WebDriver dr = new ChromeDriver();
    @BeforeMethod
    public void open(){

        dr.get("http://login.test.weidiango.com/?from=http%3A%2F%2Findex.test.weidiango.com%2Fshops");
        dr.manage().window().maximize();
        dr.navigate().refresh();
    }
    @AfterMethod
    public void shatdown(){
        dr.quit();
    }



}
