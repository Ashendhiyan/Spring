package bean;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public Boy() {
        System.out.println("Boy is here");
    }

    public void ChatWithGirl(){
        Girl girl = new Girl();
        girl.chat();
    }
}
