package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.bean.SpringBean;
import lk.ijse.gdse.aad.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SpringBean bean = ctx.getBean(SpringBean.class);
        bean.testBean();
        System.out.println(bean);

        ctx.close();
    }
}
