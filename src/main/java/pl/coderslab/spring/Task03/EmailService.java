package pl.coderslab.spring.Task03;

public class EmailService implements MessageService{

    @Override
    public void send() {
        System.out.println("Sending email");
    }
}
