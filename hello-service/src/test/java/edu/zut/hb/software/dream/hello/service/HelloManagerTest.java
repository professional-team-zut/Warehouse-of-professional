package edu.zut.hb.software.dream.hello.service;

import edu.zut.hb.software.dream.hello.service.impl.HelloManagerImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class HelloManagerTest {
HelloManager helloManager=new HelloManagerImpl();
    @Test
    public void testSayHello() {
        String expect="*****,World!";
        String name="World";
        String result=this.helloManager.sayHello(name);
        Assert.assertEquals(expect,result);
    }
}
