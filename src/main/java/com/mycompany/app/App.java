package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    public static final String MESSAGE = "Hello World!";
    private String message = "";
    public App() {}

    public static void main(String[] args) {
        final App app = new App();
        for (int i=0; i < 1000; i++) {
            app.setMessage(MESSAGE + " " + i);
            System.out.println(MESSAGE + " " + i);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
