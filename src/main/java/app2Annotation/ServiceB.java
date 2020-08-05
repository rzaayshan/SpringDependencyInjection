package app2Annotation;

import org.springframework.stereotype.Component;

@Component("service1")
public class ServiceB implements ServiceX {
    public String getInfo() {
        return "ServiceB's info";
    }
}
