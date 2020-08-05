package app1JavaConfig;

public class ClientA implements Client{
    private final Service service;

    public ClientA(Service service){
        this.service=service;

    }
    public void doSomething() {
        System.out.println(service.getInfo());
    }
}
