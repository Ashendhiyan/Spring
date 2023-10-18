package DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Kamal implements DI{


    // Property Injection

  /*  @Autowired
    GoodKamali kamali;*/

    GoodKamali kamali;

    // Constructor Injection
/*
    @Autowired
    public Kamal(GoodKamali k) {
        this.kamali=k;
        System.out.println("Kamal is in the context");
    }
*/



    // Setter Method Injection

   /* @Autowired
    public void setKamali(GoodKamali kamali){
        this.kamali=kamali;
    }
*/



    //Interface Through Injection

    @Autowired
    @Override
    public void inject(GoodKamali kamali) {
        this.kamali=kamali;
    }

    public Kamal() {
        System.out.println("Kamal is in the context");
    }

    public void ChatWithKamali(){
        kamali.chat();
    }
}
