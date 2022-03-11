package hello.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HelloManageTest {
    HelloManager helloManager = new HelloManagerImpl();
@Test
    public void testSayHello(){
        String expected = "Hello,World!";
        String name ="World";
        String result = this.helloManager.sayHello(name);
        Assert.assertEquals(expected,result);

    }
}
