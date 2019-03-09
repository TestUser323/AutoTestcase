package suite.Parem;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
    @Test(dataProvider = "data")
    @Parameters({"name","age"})
    public void case1(String name,int age){
        System.out.println("name"+name+"age"+age);
    }
    @Test()

  /*进行参数化操作*/
   @DataProvider(name = "data")
    public Object[][] parmete(){
       Object[][] o = new Object[][] {
            {"zhangsan",15},
            {"xiaohong",25},
            {"xiaoli",22}
        };
          return o;
    }


}
