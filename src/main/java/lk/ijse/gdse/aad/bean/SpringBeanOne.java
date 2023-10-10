package lk.ijse.gdse.aad.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("Spring Bean One");
    }

    public void testBean(){
        System.out.println("Yes....Test Bean is working..!!");
    }
}
