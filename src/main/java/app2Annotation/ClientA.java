package app2Annotation;

import org.springframework.stereotype.Component;

@Component("client")
public class ClientA implements Client {
    private final ServiceX service;

    public ClientA(ServiceX serviceC){
        this.service=serviceC;

    }
    public void doSomething() {
        System.out.println(service.getInfo());
    }
}
