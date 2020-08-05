package app2Annotation;


import org.springframework.stereotype.Service;

@Service
public class ServiceC implements ServiceX {
    public String getInfo() {
        return "ServiceC's info";
    }
}
