package pl.coderslab.spring.Task04;

import pl.coderslab.spring.Task03.MessageService;

public class MessageSender {
    private MessageService messageService;


    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {
        messageService.send();
    }

}
