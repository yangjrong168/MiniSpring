package org.haley.spring;

import org.haley.spring.beans.BeansException;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestBean testBean = null;
        try {
            testBean = (TestBean)context.getBean("testBean");
        } catch (BeansException e) {
            e.printStackTrace();
        }
        testBean.sayHello();
    }
}
