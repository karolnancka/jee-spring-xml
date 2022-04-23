package pl.coderslab.spring.Task03;

public class SmsService implements MessageService {

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }
}
