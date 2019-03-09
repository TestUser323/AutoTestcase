package TestSX;

import org.testng.annotations.Test;

public class Sx {
    @Test
    public void case1(){
        System.out.println("这个最后执行");
    }
    @Test
    public void case2(){
        System.out.println("这个第二个执行");
    }
    @Test
    public void case3(){
        System.out.println("这个第一个执行");
    }

}
