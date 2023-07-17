package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        app1.setMessage("Hello World!");
        app2.setMessage("Hello World!");
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
        app.setMessage("Hello World!");
        assertEquals("Hello World!", app.getMessage());
    }

    @Test
    public void testCountMessages() {
        final App app = new App();
        for (int i=0; i < 1000; i++) {
            app.setMessage(App.MESSAGE + " " + i);
            System.out.println(App.MESSAGE + " " + i);
        }
        assertEquals(App.MESSAGE + " " + 999, app.getMessage());
    }
}
