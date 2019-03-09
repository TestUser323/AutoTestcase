package suite.Parem;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pare {
    @Test
    @Parameters({"name","age"})
    public void ces(String name,int age){
        System.out.println("name :" + name + "age :" + age);
    }
}

