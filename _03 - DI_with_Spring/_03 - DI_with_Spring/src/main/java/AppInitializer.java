import DI.Kamal;
import bean.Boy;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();


        Boy bean = ctx.getBean(Boy.class);
        bean.ChatWithGirl();

      /*  Kamal kamal = ctx.getBean(Kamal.class);
        kamal.ChatWithKamali();*/


    }
}
