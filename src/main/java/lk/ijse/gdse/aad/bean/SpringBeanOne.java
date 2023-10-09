package lk.ijse.gdse.aad.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("Spring Bean One");
    }

    public void testBean(){
        System.out.println("Yes....Test Bean is working..!!");
    }
}
