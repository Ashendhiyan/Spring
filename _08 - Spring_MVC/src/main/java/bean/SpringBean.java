package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean  implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean,
        DisposableBean {
    public SpringBean() {
        System.out.println("Spring Bean instantiated...");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name Aware called..");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware ..");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware called ..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean called and bean is  ready to use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring bean one Destroyed..");
    }
}
