package org.theMungai;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook(); // to close and destroy all the beans.
        Triangle triangle = (Triangle) context.getBean("triangle");

        triangle.draw();
    }
}