package app2Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("app2Annotation");
        context.refresh();

        Client client = (Client) context.getBean("client");
        client.doSomething();

        ServiceX service2 = (ServiceX) context.getBean("service1");
        System.out.println(service2.getInfo());
    }
}
