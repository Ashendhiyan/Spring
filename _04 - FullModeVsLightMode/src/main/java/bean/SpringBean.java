package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean...");
    }


    //Light Mode

   /*  @Bean
   public MyBasicDataSource basicDataSource(){

        //Inter-bean dependency Invocation
        MyConnection Connection = myConnection();
        MyConnection Connection1 = myConnection();
        MyConnection Connection2 = myConnection();

        System.out.println(Connection);
        System.out.println(Connection1);
        System.out.println(Connection2);

        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(Connection);

        return myBasicDataSource;
    }*/

    @Bean
    public MyConnection myConnection(){
        return new MyConnection();
    }

}
