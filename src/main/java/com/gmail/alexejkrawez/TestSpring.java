package com.gmail.alexejkrawez;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }

}
