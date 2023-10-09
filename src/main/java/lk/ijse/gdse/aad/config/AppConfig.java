package lk.ijse.gdse.aad.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.aad.bean")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Object Created");
    }
}
