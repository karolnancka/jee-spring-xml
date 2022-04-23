package pl.coderslab.spring.Task02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTask02Example {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Task02.xml");
        HelloWorldTask02 hwT2 = ctx.getBean("Task02HelloWorld", HelloWorldTask02.class);
        System.out.println("content of text message: " + hwT2.getMessage());
        hwT2.printMessage();
    }
}
