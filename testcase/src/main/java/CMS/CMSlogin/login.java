package CMS.CMSlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
    WebDriver dr = new ChromeDriver();
    @Test
    public void login(){
        dr.findElement(By.name("phone")).sendKeys("11111111111");
        dr.findElement(By.name("code")).sendKeys("123456");
        dr.findElement(By.className("login-button")).click();
    }
}
