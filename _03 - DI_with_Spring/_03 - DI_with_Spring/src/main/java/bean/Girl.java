package bean;

import org.springframework.stereotype.Component;

@Component
public class Girl {
    public Girl() {
        System.out.println("Girl is here");
    }
    public void chat(){
        System.out.println("Chatting");
    }
}
