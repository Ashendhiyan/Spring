package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {
    //${}  -->   property placeholder
    @Value("${user.name}")
    private String osName;
    @Value("${HOMEPATH}")
    private String homePath;

    @Value("${ijse.application.name}")
    private String projectName;

    public SpringBeanOne() {
        System.out.println("Spring Bean One instantiate..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(homePath);
        System.out.println(projectName);
    }
}
