package sample;

import java.io.PrintStream;

/**
 * Created by Pavel on 2/1/2017.
 */
public class Greeter {

    public void greet(PrintStream to, String name) {
        to.println(sayHello(name));
    }

    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
