package config;

import bean.SpringBeanOne;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

    @Bean
    public SpringBeanOne getBeanOne(){
        //InterBean Dependency
        SpringBeanTwo b1 = getBeanTwo();
        SpringBeanTwo b2 = getBeanTwo();
        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getBeanTwo(){
        return new SpringBeanTwo();
    }
}
