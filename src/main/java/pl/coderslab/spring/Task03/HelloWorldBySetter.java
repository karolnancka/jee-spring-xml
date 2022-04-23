package pl.coderslab.spring.Task03;

public class HelloWorldBySetter {
    private String message;

    public HelloWorldBySetter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
