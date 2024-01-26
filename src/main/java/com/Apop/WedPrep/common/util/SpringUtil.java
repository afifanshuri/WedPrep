package com.Apop.WedPrep.common.util;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringUtil {

    @Autowired
    private ConfigurableApplicationContext appContext;

    public <T> T getBean(Class<T> beanClass) {
        return appContext.getBean(beanClass);
    }
}


