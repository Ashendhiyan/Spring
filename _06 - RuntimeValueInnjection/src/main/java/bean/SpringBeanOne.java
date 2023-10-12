package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    @Autowired(required = false)
    public SpringBeanOne(@Value("C001") String id, @Value("10") int age, @Value("true") boolean b) {
        System.out.println("Spring Bean one");
        System.out.println(id);
        System.out.println(age);
        System.out.println(b);
    }


    @Autowired(required = false)
    public SpringBeanOne(@Value("Ashen,Bawantha,Chaluka") String[] name) {
        System.out.println("Spring Bean");
        for(String MyName : name){
            System.out.println(MyName);
        }
    }
}
