package CMS.CMSlogin;

import CMS.Cms;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class login extends Cms {

    @Test
    public void login(){
        dr.findElement(By.name("phone")).sendKeys("11111111111");
        dr.findElement(By.name("code")).sendKeys("123456");
        dr.findElement(By.className("login-button")).click();
        sleep(5000);
     /*   dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/div/div/div[21]/div/div")).click();*/
        WebElement list = dr.findElement(By.className("alias-wrap"));
        List<WebElement> lists = list.findElements(By.tagName("alias-name"));
        lists.get(21).click();


        /**
         * 使用cookie登录
         * */
/*        Cookie C1 = new Cookie("WD_SID","612a80f12a0640ba857535cf008d9afe");
        Cookie C2 = new Cookie("_bl_uid","Chjw1td14ChaRd4wC00p5sk3ygdF");
        Cookie C3 = new Cookie("mpAlias","ghd8fa01bdf649");

        dr.manage().addCookie(C1);
        dr.manage().addCookie(C2);
        dr.manage().addCookie(C3);

        dr.navigate().refresh();*/
    }
}
