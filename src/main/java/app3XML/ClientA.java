package app3XML;

public class ClientA implements Client {
    private Service service;

    public ClientA(Service service){
        this.service=service;

    }

    public void setService(Service service) {
        this.service = service;
    }

    public void doSomething() {
        System.out.println(service.getInfo());
    }
}
