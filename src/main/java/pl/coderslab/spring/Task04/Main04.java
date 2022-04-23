package pl.coderslab.spring.Task04;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.spring.Task03.EmailService;
import pl.coderslab.spring.Task03.HelloWorldBySetter;

public class Main04 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean04.xml");

        MessageSender emailSender = ctx.getBean("emailSender", MessageSender.class);
        emailSender.sendMessage();
        MessageSender smsSender = ctx.getBean("smsSender", MessageSender.class);
        smsSender.sendMessage();


        ctx.close();
    }
}
