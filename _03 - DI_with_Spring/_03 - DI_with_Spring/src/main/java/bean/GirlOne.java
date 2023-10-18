package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GirlOne implements GoodGirl,BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public GirlOne() {
        System.out.println("GirlOne is here");
    }

    @Override
    public void chat(){
        System.out.println("GirlOne is Chatting");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("GirlOne  Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("GirlOne Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("GirlOne Disposable Bean Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("GirlOne Initializing Bean  Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("GirlOne Application context");
    }
}
