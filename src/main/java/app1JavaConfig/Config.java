package app1JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean("client1")
    public Client getClient(Service service1){
        return new ClientA(service1);
    }

    @Bean("service1")
    public Service getService(){
        return new ServiceB();
    }

    @Bean
    public Service service2(){
        return new ServiceC();
    }

    @Bean
    public Client client2(Service service2){
        return new ClientA(service2);
    }

    @Bean({"service3", "serviceD"})
    public Service getService3(){
        return new ServiceD();
    }
}
