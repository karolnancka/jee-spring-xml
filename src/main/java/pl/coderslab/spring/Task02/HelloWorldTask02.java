package pl.coderslab.spring.Task02;

public class HelloWorldTask02 {
    private String message;

    public HelloWorldTask02(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Your Message : " + message);
    }

}
