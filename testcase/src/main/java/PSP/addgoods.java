package PSP;
import org.aspectj.util.FileUtil;
import org.jboss.netty.util.Timeout;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class addgoods {

        public WebDriver dr = new ChromeDriver();

        public void sleep(int timeout) {
            try {
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        @Test
        public void login() {
            dr.get("http://psp.test.weidiango.com/#/login");
            dr.findElement(By.name("account")).sendKeys("26666666666");
            dr.findElement(By.name("password")).sendKeys("1");
            dr.findElement(By.className("code")).sendKeys("123456");
            dr.findElement(By.className("login-submit")).click();

        }

        @Test(dependsOnMethods = {"login"})
        public void shopmeno() {
            dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            List<WebElement> lists = dr.findElements(By.className("icon-wrapper"));
            lists.get(1).click();
            dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            List<WebElement> shoplist = dr.findElements(By.className("submenu-item"));
            shoplist.get(1).click();
            sleep(1500);
            /*dr.findElement(By.className("")).click();*/
            List<WebElement> news = dr.findElements(By.className("ivu-btn"));
            news.get(2).click();
            sleep(1000);
            List<WebElement> inputs = dr.findElements(By.className("ivu-input"));
            inputs.get(0).sendKeys("TestDataProviderShopCreate<小刘店铺>");
            inputs.get(2).sendKeys("100");
            inputs.get(3).sendKeys("120");
            inputs.get(4).sendKeys("CS10000");
            dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            List<WebElement> next = dr.findElements(By.className("ivu-btn"));
            next.get(0).click();
            dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            List<WebElement> up1 = dr.findElements(By.className("upload-icon"));
            up1.get(0). click();

            sleep(1500);
            Runtime exe = Runtime.getRuntime();
            try {
                String str = "C:\\script.exe";
                exe.exec(str);
            } catch (IOException e) {
                System.out.println("第三方脚本没有运行");
                e.printStackTrace();
            }
            dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            up1.get(1).click();
            sleep(6000);
            Runtime exe1 = Runtime.getRuntime();
            try {
                String str = "C:\\script1.exe";
                exe1.exec(str);
            } catch (IOException e) {
                System.out.println("第三方脚本没有运行");
                e.printStackTrace();
            }
            List<WebElement> clickk = dr.findElements(By.className("ivu-checkbox-input"));
            clickk.get(0).click();
            List<WebElement> sku = dr.findElements(By.className("sku-addon"));
            sku.get(0).click();
            List<WebElement> cm = dr.findElements(By.className("ivu-select-placeholder"));
            cm.get(0).click();
            List<WebElement> cc = dr.findElements(By.className("ivu-select-item"));
            cc.get(0).click();
            Actions en = new Actions(dr);
            en.moveToElement(dr.findElement(By.className("cSelect-input-wrapper")));
            en.click();
            sleep(3000);
            en.sendKeys("X");
            en.sendKeys(Keys.ENTER).perform();
            en.sendKeys("XL");
            en.sendKeys(Keys.ENTER).perform();

            List<WebElement> nr = dr.findElements(By.className("sku-input"));
            en.moveToElement(nr.get(0)).click().perform();
            en.sendKeys("145").perform();
            en.moveToElement(nr.get(1)).click().perform();
            en.sendKeys("55").perform();
            en.moveToElement(nr.get(2)).click().perform();
            en.sendKeys("脚本商品").perform();
            List<WebElement> nextn = dr.findElements(By.className("ivu-btn"));
            nextn.get(4).click();
            sleep(5000);
            List<WebElement> fwbbj = dr.findElements(By.tagName("body"));
            en.moveToElement(fwbbj.get(0)).click().perform();
            en.sendKeys("测试脚本调试").perform();
            sleep(2500);
            List<WebElement> tj = dr.findElements(By.className("ivu-btn"));
            tj.get(1).click();
            dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            List<WebElement> sj = dr.findElements(By.className("content-opera-vertical"));
            sj.get(3).click();
            long data = System.currentTimeMillis();
            String path = String.valueOf(data);
            String cur = System.getProperty("user.dir");
            dr.manage().window().maximize();
            path = path + ".png";
            String curscreen = cur + "/" + path;
            File screen = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
            try {
                FileUtil.copyFile(screen, new File(curscreen));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

