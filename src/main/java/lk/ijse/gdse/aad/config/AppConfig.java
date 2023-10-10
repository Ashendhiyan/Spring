package lk.ijse.gdse.aad.config;

import lk.ijse.gdse.aad.bean.MyConnection;
import lk.ijse.gdse.aad.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.aad.bean")
//@ComponentScan(basePackageClasses = SpringBeanOne.class)
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Object Created");
    }


    /*When we are not allowed to put the @Component annotation we can use this method to
        introduce a spring bean  to the Application Context
    * */

    @Bean("connection")
    public MyConnection getConnection(){
        return new MyConnection();
    }
}
