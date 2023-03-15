package org.haley.spring;

import org.haley.spring.beans.BeanFactory;
import org.haley.spring.beans.BeansException;
import org.haley.spring.beans.SimpleBeanFactory;
import org.haley.spring.beans.XmlBeanDefinitionReader;
import org.haley.spring.context.ClassPathXmlResource;
import org.haley.spring.context.Resource;


public class ClassPathXmlApplicationContext implements BeanFactory {

    BeanFactory beanFactory;
    public ClassPathXmlApplicationContext(String fileName) {
        Resource resource = new ClassPathXmlResource(fileName);
        BeanFactory beanFactory = new SimpleBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
        this.beanFactory = beanFactory;
    }



    @Override
    public Object getBean(String beanName) throws BeansException {
        return beanFactory.getBean(beanName);
    }

    @Override
    public void registerBeanDefinition(BeanDefinition beanDefinition) {
        beanFactory.registerBeanDefinition(beanDefinition);
    }

}
