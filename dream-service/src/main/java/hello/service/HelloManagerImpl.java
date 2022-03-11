package hello.service;
 import hello.service.HelloManager;
public class HelloManagerImpl implements HelloManager {

    @Override
    public String sayHello(String name) {
        String result = "Hello," + name + "!";
        return result;
    }


}


