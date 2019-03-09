package suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class case3 {
    @BeforeMethod
    public void test1(){
        System.out.println("登录操作");
    }
/*    @Test
    public void ces(){
        System.out.println("是否执行");
    }*/
    @AfterMethod
    public void test2(){
        System.out.println("第一条用例登录且下单完成");
    }
}
