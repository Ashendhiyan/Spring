package DI;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Kamali implements GoodKamali{
    public Kamali() {
        System.out.println("Kamali is in the context");
    }

    public void chat(){
        System.out.println("Chatting...");
    }
}
