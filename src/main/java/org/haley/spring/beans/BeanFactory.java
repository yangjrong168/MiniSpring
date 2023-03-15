package org.haley.spring.beans;


import org.haley.spring.BeanDefinition;

public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;
    void registerBeanDefinition(BeanDefinition beanDefinition);
}
