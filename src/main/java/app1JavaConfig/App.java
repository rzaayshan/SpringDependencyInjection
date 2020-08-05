package app1JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

//        context.register(Config.class);
//        context.refresh();

        Client client1 = (Client) context.getBean("client1");
        client1.doSomething();
        Service service2 = (Service) context.getBean("service2");
        System.out.println(service2.getInfo());
        Client client2 = (Client) context.getBean("client2");
        client2.doSomething();
        Service serviceD = (Service) context.getBean("serviceD");
        Service service3 = (Service) context.getBean("service3");
        System.out.println(service3.getInfo());
        System.out.println(serviceD.getInfo());

    }
}
