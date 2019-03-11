package CMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Cms {
    public WebDriver dr;

    /*公用延迟方式*/
    public void sleep(int timeout){
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void open(){
        dr= new ChromeDriver();
        dr.get("http://login.test.weidiango.com/?from=http%3A%2F%2Findex.test.weidiango.com%2Fshops");
        dr.manage().window().maximize();
        dr.navigate().refresh();
    }

    @AfterMethod
    public void shatdown(){
       /* dr.quit();*/
       System.out.println("操作结束");
    }



}
