package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.bean.BeanTwo;
import lk.ijse.gdse.aad.bean.SpringBean;
import lk.ijse.gdse.aad.bean.SpringBeanThree;
import lk.ijse.gdse.aad.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        //  Run something before JVM shutdown   (Hooking process)
      /*  Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to shut down..");
                ctx.close();
            }
        }));

*/

        ctx.registerShutdownHook();

        ctx.register(AppConfig.class);
        ctx.refresh();


        System.out.println("---------------------------------------------------");

        SpringBean bean = ctx.getBean(SpringBean.class);
        System.out.println(bean);

        BeanTwo bean1 = ctx.getBean(BeanTwo.class);
        System.out.println(bean1);

        SpringBeanThree bean2 = ctx.getBean(SpringBeanThree.class);
        System.out.println(bean2);

//        ctx.close();


    }
}
