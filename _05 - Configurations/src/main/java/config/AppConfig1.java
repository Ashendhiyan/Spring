package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "bean")
@Import({AppConfig2.class, AppConfig3.class})   // we can import configurations into a single class
public class AppConfig1 {

}
