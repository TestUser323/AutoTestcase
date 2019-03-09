package ThreadMinOn;

import org.testng.annotations.Test;

public class ThredOn {
    @Test
    public void case1(){
        System.out.println("线程A"+Thread.currentThread().getName());
    }
    @Test
    public void case2(){
        System.out.println("线程B"+Thread.currentThread().getName());
    }
    @Test
    public void case3(){
        System.out.println("线程C"+Thread.currentThread().getName());
    }
    @Test
    public void case4(){
        System.out.println("线程D"+Thread.currentThread().getName());
    }
}
