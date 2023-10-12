import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();



        //  Access System environment variables With java
        // System.getenv();
        Map<String, String> getenv = System.getenv();
        for (String key:getenv.keySet()) {
            System.out.println(key +" : "+ getenv.get(key));
        }

        System.out.println("==================================================================");

        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            System.out.println(key +" : "+properties.get(key));
        }


    }
}
