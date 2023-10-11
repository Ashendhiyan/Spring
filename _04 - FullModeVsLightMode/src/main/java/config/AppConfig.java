package config;

import bean.MyBasicDataSource;
import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

    @Bean
    public MyBasicDataSource basicDataSource(){

//        MyConnection myConnection = new MyConnection();

        //Inter-bean dependency Innovocation
        MyConnection Connection = myConnection();
        MyConnection Connection1 = myConnection();
        MyConnection Connection2 = myConnection();

        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(Connection);

        return myBasicDataSource;
    }

    @Bean
    public MyConnection myConnection(){
        return new MyConnection();
    }
}
