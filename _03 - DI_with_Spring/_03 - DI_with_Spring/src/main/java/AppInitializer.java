import bean.Boy;
import bean.Girl;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();


   /*     Boy boy = ctx.getBean(Boy.class);
        Girl girl = ctx.getBean(Girl.class);
        System.out.println(boy);
        System.out.println(girl);
        boy.ChatWithGirl();*/


    }
}
