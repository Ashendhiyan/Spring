import bean.MyConnection;
import bean.SpringBeanOne;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();


     /*   SpringBeanOne bean1 = ctx.getBean(SpringBeanOne.class);
        SpringBeanOne bean2 = ctx.getBean(SpringBeanOne.class);

        System.out.println(bean1);
        System.out.println(bean2);
*/


        MyConnection con1 = ctx.getBean(MyConnection.class);
        MyConnection con2 = ctx.getBean(MyConnection.class);
        System.out.println(con1);
        System.out.println(con2);

    }
}
