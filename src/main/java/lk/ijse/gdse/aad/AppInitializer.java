package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.bean.MyConnection;
import lk.ijse.gdse.aad.bean.SpringBeanOne;
import lk.ijse.gdse.aad.bean.SpringBeanThree;
import lk.ijse.gdse.aad.bean.SpringBeanTwo;
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

     /*   SpringBean bean = ctx.getBean(SpringBean.class);
        System.out.println(bean);

        BeanTwo bean1 = ctx.getBean(BeanTwo.class);
        System.out.println(bean1);

        SpringBeanThree bean2 = ctx.getBean(SpringBeanThree.class);
        System.out.println(bean2);*/

//        ctx.close();
/*
        // SpringBeanOne    ---->   springBeanOne (bean ID)
        //Object bean = ctx.getBean("springBeanOne");
        SpringBeanOne bean1 = (SpringBeanOne) ctx.getBean("springBeanOne");
        System.out.println(bean1);

        //        SpringBeanTwo ----->  springBeanTwo
        SpringBeanTwo bean2 = (SpringBeanTwo) ctx.getBean("springBeanTwo");
        System.out.println(bean2);

        //      @Component("BeanThree")
        SpringBeanThree bean3 = (SpringBeanThree) ctx.getBean("BeanThree");
        System.out.println(bean3);*/

        //---------------------------

        MyConnection bean = ctx.getBean(MyConnection.class);
        System.out.println(bean);

        //@Bean - Bean ID ----> bean method name
      /*  MyConnection bean1 = (MyConnection) ctx.getBean("getConnection");
        System.out.println(bean1);*/

        // we can change default id @Bean("connection")
        MyConnection bean2 = (MyConnection) ctx.getBean("connection");
        System.out.println(bean2);
    }
}
