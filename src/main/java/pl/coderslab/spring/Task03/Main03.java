package pl.coderslab.spring.Task03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main03 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Task03.xml");
        HelloWorldBySetter hwT3 = ctx.getBean("Task03HelloWorld", HelloWorldBySetter.class);
        System.out.println(hwT3.getMessage());

        EmailService seT3 = ctx.getBean("EmailService", EmailService.class);
        SmsService ssT3 = ctx.getBean("SmsService", SmsService.class);

        seT3.send();
        ssT3.send();
    }
}
