package suite;

import org.testng.annotations.*;

public class Case1 {
    @BeforeSuite
    public void case1(){
        System.out.println("套件信息开始");
    }
    @BeforeGroups()
    public void case5(){
        System.out.println("组信息");
    }
    @BeforeClass
    public void case3(){
        System.out.println("类信息开始");
    }
    @Test(enabled = false)
    public void case7(){
        System.out.println("这个测试方法运行在组内");
    }
    @Test
    public void case8(){
        System.out.println("一个普通的测试方法");
    }
    @AfterClass
    public void case4(){
        System.out.println("类信息结束");
    }
    @AfterGroups
    public void case6(){
        System.out.println("组信息运行结束");
    }
    @AfterSuite
    public void case2(){
        System.out.println("套件信息结束");
    }

}
