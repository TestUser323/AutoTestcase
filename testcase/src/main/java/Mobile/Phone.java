package Mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Phone {

        public AndroidDriver<AndroidElement> dr;

        /*延迟操作*/
        public void sleep(int timeout) {
            try {
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /*下拉操作*/
        public void downswip(AndroidDriver<AndroidElement> dr, int during, int num) {
            int width = dr.manage().window().getSize().width;
            int height = dr.manage().window().getSize().height;
            for (int i = 0; i <= num; i++) {
                dr.swipe(width/4, height/4, width/4, height*2/4, during);
            }
        }

        /*上操作*/
        public void upswip(AndroidDriver<AndroidElement> dr,int during,int num){
            int width = dr.manage().window().getSize().width;
            int height = dr.manage().window().getSize().height;
            for (int i = 0; i <= num; i++) {
                dr.swipe(width/4, height *3/4, width*1/4, height*1/4, during);
            }
        }
        /*左滑操作*/
        public void leftswip(AndroidDriver<AndroidElement> dr,int during,int num){
            int width = dr.manage().window().getSize().width;
            int height = dr.manage().window().getSize().height;
            for (int i = 0; i <= num; i++) {
                dr.swipe(width*1/4, height /4, width*3/4, height/4, during);
            }
        }
        /*右滑操作*/
        public void rightswip(AndroidDriver<AndroidElement> dr,int during,int num){
            int width = dr.manage().window().getSize().width;
            int height = dr.manage().window().getSize().height;
            for (int i = 0; i <= num; i++) {
                dr.swipe(width*3/4, height/4, width/4, height*1/4, during);
            }
        }
        /*截图操作*/
        public void TakesScreenshot(){
            long data = System.currentTimeMillis();
            String path = String.valueOf(data);
            String curscreen = System.getProperty("user,dir");
            path = path+".png";
            String scurreanpath = curscreen+"/"+path;
            File scureen = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
            try {
                FileUtil.copyFile(scureen,new File(scurreanpath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        @BeforeMethod
        public void setup() throws Exception {
            System.out.println("验证加入购物车SKU");
            /*AndroidDriver<AndroidElement> dr;*/
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "325376840548");
            cap.setCapability("platform", "7.1.1");
            cap.setCapability("app", "D:\\weixin.apk");
            cap.setCapability("appPackage", "com.tencent.mm");
            cap.setCapability("appActivity", "com.tencent.mm.ui.LauncherUI");
            cap.setCapability("resetKeyboard", "true"); //重置键盘输入法使用默认
            cap.setCapability("unicodeKeyboard", "true"); //具备中文输入
            cap.setCapability("noReset", "true");
            dr = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        }

        @Test
        public void open() {
            String a="精品女装抹胸";
            sleep(3000);
            dr.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
            /* leftswip(1,600,5);*/
            int width = dr.manage().window().getSize().width;//获取当前屏幕的宽度
            int height = dr.manage().window().getSize().height;//获取当前屏幕高度
            sleep(5000);
            dr.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
            dr.swipe(width/2, height/4, width/2, height*3/4, 600);
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"宝妈学保养\")").click();
            sleep(5000);
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            if(a.equals("精品女装抹胸")){
                dr.findElementByAndroidUIAutomator("new UiSelector().text(\"精品女装抹胸\")").click();
            }
            else{
                System.out.println("未找到该元素");
            }
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"绿花17369\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"XL\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"黄花17369\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"M\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            sleep(2500);
            dr.findElement(By.id("com.tencent.mm:id/n0")).click(); //返回操作
            dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"2018新款\")").click();
            dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"S\")").click();
            dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"M\")").click();
            dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            dr.findElement(By.id("com.tencent.mm:id/n0")).click(); //返回操作
            sleep(3000);
            dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            dr.swipe(width/2,height*3/4,width/2,height*1/4,550);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"测试呀\")").click();
            dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"白色\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"M\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"加入购物车\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"白色\")").click();
            dr.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"XXL\")").click();
            dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            dr.findElement(By.id("com.tencent.mm:id/n0")).click(); //返回操作
            dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"购物车\")").click();
            TakesScreenshot();
            dr.manage().timeouts().implicitlyWait(30,TimeUnit.MINUTES);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"结算\")").click();
            sleep(4000);
            dr.swipe(width/2, height/4, width/2, height*2/4, 600);
            dr.findElementByAndroidUIAutomator("new UiSelector().text(\"支付订单\")").click();
        }

        @AfterMethod
        public void down() {
            dr.quit();
        }
    }


