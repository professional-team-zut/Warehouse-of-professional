package edu.zut.hb.software.dream.hello.service.impl;
import edu.zut.hb.software.dream.hello.service.HelloManager;
public class HelloManagerImpl implements HelloManager {
    @Override
    public String sayHello(String name) {
       String result="Hello,"+name+"!";
       return result;
    }
}
