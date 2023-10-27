package calc.controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class Logging {

    public Logging() {
    }

    public void loggingFiling(int a, int b, char op) {

        java.util.logging.Logger ll = java.util.logging.Logger.getLogger(Logging.class.getName());

        try {
            String logsPath = "log.txt";
            FileHandler fh = new FileHandler(logsPath, true);
            ll.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();

            fh.setFormatter(formatter);
        } catch (IOException e) {
            System.out.println(e);
        }

        ll.log(Level.INFO, "Log: " + a + " " + op + " " + b + " = " + Calculator.calculate(op, a, b));

    }
}
