package suite;

import org.testng.annotations.Test;

public class case2 {
     @Test(groups = {"group1"})
    public void testLogin(){
      System.out.println("组1");
     }
      @Test(groups = {"group2"})
     public void testOpenPage(){
      System.out.println("组2");
     }
}
